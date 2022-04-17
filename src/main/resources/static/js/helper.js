
function validateForm(f){
    var  parent = f.parentNode.parentNode;
    var input = $(parent).find('.required');
    var result = true;
    for(var i = 0; i < input.length; i++){
        if(input[i].value == ''){
            $(input[i]).attr('placeholder', 'This field is required');
            result = false;
        }else
        {
            $(input[i]).attr('placeholder', '');
        }
    }
    return result;
}

function getFormData($form,key,value){
    var unindexed_array = $form.serializeArray();
    var indexed_array = {};

    $.map(unindexed_array, function(n, i){
        indexed_array[n['name']] = n['value'];
    });
    indexed_array[key] = encrypt(value);

    return indexed_array;
}

function encrypt(text){
    var cipher = CryptoJS.AES.encrypt(text, 'secret key 123');
    return cipher.toString();
}

function decrypt(text){
    var bytes  = CryptoJS.AES.decrypt(text, 'secret key 123');
    var plaintext = bytes.toString(CryptoJS.enc.Utf8);
    return plaintext;
}

function formatCurrency(){
    $('.currency').each(function(){
        if ($(this).val() != '') {
            let value =$(this).val()
            let format =  new Intl.NumberFormat();
            $(this).val(format.formatToParts(value).map(({type, value}) => {
                switch (type) {
                    case 'currency':
                        return '';
                    default:{
                        return value;
                    }
                }
            }).reduce((string, part) => string + part));
        }
        else if($(this).text() == ''){
            let value = $(this).text()
            let format =  new Intl.NumberFormat();
            $(this).text(format.formatToParts(value).map(({type, value}) => {
                switch (type) {
                    case 'currency':
                        return '';
                    default:{
                        return value;
                    }
                }
            }).reduce((string, part) => string + part));
        }

    });


}