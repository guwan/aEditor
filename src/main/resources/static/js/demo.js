$('#medium-editor-submit').click(function(){
	event.preventDefault();//使a自带的方法失效
    $.post('*', {'nike':0},
    function(cdata) {
        console.log('ok', cdata)
    })
})