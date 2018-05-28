<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" type="text/css" href="index.css">
<title>Webshop</title>
</head>
<body>
	<div class="container">
		<div class="header">
			<h1>Web Shop</h1>
		</div>
		<div class="body">
		<div class="main">
			<ul>
				<li>
				${ item1 } 
				<br>
				Prijs: ${ item1prijs }
				<br>
				Aantal: ${item1aantal}
				<br> 
				<button>add</button>
				</li>
				<li>
				${ item2 }<button>add</button>
				</li>
				<li>
				${ item3 }<button>add</button>
				</li>
				<li>
				${ item4 }<button>add</button>
				</li>
			</ul>
		</div>
		<div class="items">
			<ul>
				<li>
				${ item1 }
				</li>
				<li>
				${ item2 }
				<li>
				${ item3 }
				</li>
				<li>
				${ item4 }
			</ul>
			<ul>
				<li> 
					subtotal: //${ totalPrijs }
				</li>
			</ul>
		</div>
		</div>
	</div>
</body>
</html>