$(document).ready(function(){
	$("#btn_regist").click(function(){
		$("#frm").attr("method","post");
		$("#frm").attr("action","/UserRegist/Regist");
		$("#frm").submit();
	});
});
	 
	 