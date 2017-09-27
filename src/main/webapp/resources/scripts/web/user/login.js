/**
 * 
 */

 registerUser = function(){
	var data = $("#addForm").serialize();
	
/*	 $.post("/login/registerUser.do",data,function(data){
		 alert("Data: " + data + "\nStatus: " + status);
	},"json");
	 */
	 
	 $.ajax({
		 url:"/login/registerUser.do",
		 async:true,
		 type:"POST",
         dataType:"json",
         data:data,
		 success:function(result){
			document.write(result);
		}});
	
} 


