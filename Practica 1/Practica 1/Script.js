function retornarFecha()
{
  var fecha
  fecha=new Date();
  var cadena=fecha.getDate()+'/'+(fecha.getMonth()+1)+'/'+fecha.getYear();
  alert(fecha);
}

function retornar()
{
alert("No hay nada que buscar");
}


function controlMenu()
{
 document.getElementById("open-hide").classList.toggle('show');
}

window.onload = function() 
{
  document.getElementById("open-hide").addEventListener( 'click' , changeClass ); 
}