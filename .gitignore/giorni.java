<?
$m=$_POST['m'];
$a=$_POST['a'];

$g11=$_POST['g11'];
$g12=$_POST['g12'];
$g21=$_POST['g21'];
$g22=$_POST['g22'];
$g31=$_POST['g31'];
$g32=$_POST['g32'];
$g41=$_POST['g41'];
$g42=$_POST['g42'];
$g51=$_POST['g51'];
$g52=$_POST['g52'];

$s1=$_POST['s1'];
$s2=$_POST['s2'];
$s3=$_POST['s3'];
$s4=$_POST['s4'];
$s5=$_POST['s5'];

$Stato = "false";
$OraMV = ['8:30', '9:00', '9:30', '10:00', '10:30', '11:00', '11:30', '12:00', '12:30', '13:00', '13:30','15:00', '15:30', '16:00', '16:30', '17:00', '17:30', '18:00', '18:30'];
$OraS =  ['8:30', '9:00', '9:30', '10:00', '10:30', '11:00', '11:30', '12:00', '12:30', '13:00', '13:30', '14:30','15:00', '15:30', '16:00', '16:30', '17:00', '17:30', '18:00', '18:30', '19:00', '19:30', '20:00'];

$DBhost = "localost";
$DBuser = "";
$DBpass = "";
$DBName = "my_salvobarbershop";

/* specifichiamo il nome della nostra tabella */
$table = "listaprenotazioni";

/* Connettiamoci al database */
$conn = mysql_connect($DBhost,$DBuser,$DBpass) or die("Impossibile collegarsi al server");
@mysql_select_db("$DBName") or die("Impossibile connettersi al database $DBName");
if ($conn->connect_error) 
{
    die("Connection failed: " . $conn->connect_error);
} 
/* pulire db*/

//$sqlquery = "DELETE  FROM $table ";
//mysql_query($sqlquery);

if($m!='' && $a!=''){
if($m>=1 && $m<=9){ $m= '0'.$m;} // mette zero al mese
	
for($i=1 ; $i<32 ; $i++)
{
	if($i>=1 && $i<=9)
	{
	$data= '0'.$i.'-'.$m.'-'.$a;
    }else{
		 $data= $i.'-'.$m.'-'.$a;
 		}
 
if($i>=$g11 && $i<=$g12)
		{
        for($v=0; $v<19; $v++){
          $sqlquery = "INSERT INTO ".$table." (IdCliente,Operatore,Data,Ora, Stato) VALUES (0,1,'$data','$OraMV[$v]','$Stato')";
          $result = mysql_query($sqlquery); 

          $sqlquery1 = "INSERT INTO ".$table." (IdCliente,Operatore,Data,Ora, Stato) VALUES (0,2,'$data','$OraMV[$v]','$Stato')";
          $result1 = mysql_query($sqlquery1);
          }
		}
if($i==$s1 && $i!=0){
	echo "'s1' $s1 <dr/>";
	for($v=0; $v<23; $v++){
          $sqlquery = "INSERT INTO ".$table." (IdCliente,Operatore,Data,Ora, Stato) VALUES (0,1,'$data','$OraS[$v]','$Stato')";
          $result = mysql_query($sqlquery); 

          $sqlquery1 = "INSERT INTO ".$table." (IdCliente,Operatore,Data,Ora, Stato) VALUES (0,2,'$data','$OraS[$v]','$Stato')";
          $result1 = mysql_query($sqlquery1);
          }
}
if($i>=$g21 && $i<=$g22){

for($v=0; $v<19; $v++){
          $sqlquery = "INSERT INTO ".$table." (IdCliente,Operatore,Data,Ora, Stato) VALUES (0,1,'$data','$OraMV[$v]','$Stato')";
          $result = mysql_query($sqlquery); 

          $sqlquery1 = "INSERT INTO ".$table." (IdCliente,Operatore,Data,Ora, Stato) VALUES (0,2,'$data','$OraMV[$v]','$Stato')";
          $result1 = mysql_query($sqlquery1);
          }
			}
if($i==$s2 && $i!=0){
echo "'s2' $s2 <dr/>";
for($v=0; $v<23; $v++){
          $sqlquery = "INSERT INTO ".$table." (IdCliente,Operatore,Data,Ora, Stato) VALUES (0,1,'$data','$OraS[$v]','$Stato')";
          $result = mysql_query($sqlquery); 

          $sqlquery1 = "INSERT INTO ".$table." (IdCliente,Operatore,Data,Ora, Stato) VALUES (0,2,'$data','$OraS[$v]','$Stato')";
          $result1 = mysql_query($sqlquery1);
          }
          }
if($i>=$g31 && $i<=$g32){

for($v=0; $v<19; $v++){
		$sqlquery = "INSERT INTO ".$table." (IdCliente,Operatore,Data,Ora, Stato) VALUES (0,1,'$data','$OraMV[$v]','$Stato')";
          $result = mysql_query($sqlquery); 

          $sqlquery1 = "INSERT INTO ".$table." (IdCliente,Operatore,Data,Ora, Stato) VALUES (0,2,'$data','$OraMV[$v]','$Stato')";
          $result1 = mysql_query($sqlquery1);
          }
}
if($i==$s3 && $i!=0){
echo "'s3' $s3 <dr/>";
for($v=0; $v<23; $v++){
          $sqlquery = "INSERT INTO ".$table." (IdCliente,Operatore,Data,Ora, Stato) VALUES (0,1,'$data','$OraS[$v]','$Stato')";
          $result = mysql_query($sqlquery); 

          $sqlquery1 = "INSERT INTO ".$table." (IdCliente,Operatore,Data,Ora, Stato) VALUES (0,2,'$data','$OraS[$v]','$Stato')";
          $result1 = mysql_query($sqlquery1);
          }
}
if($i>=$g41 && $i<=$g42){

for($v=0; $v<19; $v++){
		$sqlquery = "INSERT INTO ".$table." (IdCliente,Operatore,Data,Ora, Stato) VALUES (0,1,'$data','$OraMV[$v]','$Stato')";
          $result = mysql_query($sqlquery); 

          $sqlquery1 = "INSERT INTO ".$table." (IdCliente,Operatore,Data,Ora, Stato) VALUES (0,2,'$data','$OraMV[$v]','$Stato')";
          $result1 = mysql_query($sqlquery1);
          }
}
if($i==$s4 && $i!=0){
echo "'s4' $s4 <dr/>";
for($v=0; $v<23; $v++){
          $sqlquery = "INSERT INTO ".$table." (IdCliente,Operatore,Data,Ora, Stato) VALUES (0,1,'$data','$OraS[$v]','$Stato')";
          $result = mysql_query($sqlquery); 

          $sqlquery1 = "INSERT INTO ".$table." (IdCliente,Operatore,Data,Ora, Stato) VALUES (0,2,'$data','$OraS[$v]','$Stato')";
          $result1 = mysql_query($sqlquery1);
}
}

if($i>=$g51 && $i<=$g52){

for($v=0; $v<19; $v++){
		$sqlquery = "INSERT INTO ".$table." (IdCliente,Operatore,Data,Ora, Stato) VALUES (0,1,'$data','$OraMV[$v]','$Stato')";
          $result = mysql_query($sqlquery); 

          $sqlquery1 = "INSERT INTO ".$table." (IdCliente,Operatore,Data,Ora, Stato) VALUES (0,2,'$data','$OraMV[$v]','$Stato')";
          $result1 = mysql_query($sqlquery1);
          }
}
if($i==$s5 && $i!=0){
echo "'s5' $s5 <dr/>";
for($v=0; $v<23; $v++){
$sqlquery = "INSERT INTO ".$table." (IdCliente,Operatore,Data,Ora, Stato) VALUES (0,1,'$data','$OraS[$v]','$Stato')";
          $result = mysql_query($sqlquery); 

          $sqlquery1 = "INSERT INTO ".$table." (IdCliente,Operatore,Data,Ora, Stato) VALUES (0,2,'$data','$OraS[$v]','$Stato')";
          $result1 = mysql_query($sqlquery1);
}
}
}
}


echo "
<body bgcolor='#ABCDEF'>
<p align='center'>

<form action='GiorniMESE.php' method='POST'>
<table border='1' align='center'>
    <caption>
        <p> <a href='ModLista.php'><img src='../SalvoPannello/icon/back.png' alt='Back' width='35' height='35'></a>
</tablet> GIORNI</p>
    </caption>
   
    <thead>
    
        <tr><th><p>primo giorno 1° settimana </p></th><th><input type='text' name='g11' value='' /></th><th><input type='text' name='g12' value ='' /></th><th>  Sabato:  </th><th> <input type='text' name='s1' value ='' /> </th></tr>
        <tr><th><p>primo giorno 2° settimana </p></th><th><input type='text' name='g21' value='' /></th><th><input type='text' name='g22' value ='' /></th><th>  Sabato:  </th><th> <input type='text' name='s2' value ='' /> </th></tr>
		<tr><th><p>primo giorno 3° settimana </p></th><th><input type='text' name='g31' value='' /></th><th><input type='text' name='g32' value ='' /></th><th>  Sabato:  </th><th> <input type='text' name='s3' value ='' /> </th></tr>
        <tr><th><p>primo giorno 4° settimana </p></th><th><input type='text' name='g41' value='' /></th><th><input type='text' name='g42' value ='' /></th><th>  Sabato:  </th><th> <input type='text' name='s4' value ='' /> </th></tr>
        <tr><th><p>primo giorno 5° settimana </p></th><th><input type='text' name='g51' value='' /></th><th><input type='text' name='g52' value ='' /></th><th>  Sabato:  </th><th> <input type='text' name='s5' value ='' /> </th></tr>
   		<tr><th><p><input type='submit'></p></th> <th>MESE: <input type='text' name='m' value='' /> </th><th>ANNO: <input type='text' name='a' value='' /></th></tr>
   	</thead>
    
     <tbody>
   
</form>
</p>
";
?>
