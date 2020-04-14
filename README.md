
var product = [{
	"product_id" : 1,
	"product_resource_key" : "src:express:product:111",
	"name" : "Fridge",
	"model" : "LG-345",
},{
	"product_id" : 2,
	"product_resource_key" : "src:express:product:222",
	"name" : "Computer",
	"model" : "HP-239"
},{
	"product_id" : 3,
	"product_resource_key" : "src:express:product:333",
	"name" : "Leptop",
	"model" : "SMG-245"
},{
	"product_id" : 4,
	"product_resource_key" : "src:express:product:444",
	"name" : "bike",
	"model" : "Bk-432"
},{
	"product_id" : 5,
	"product_resource_key" : "src:express:product:555",
	"name" : "car",
	"model" : "CR-i435"
}
]

var experience = [
{
	"exoerience_id" : 1,
	"expreience_resource_key" : "src:express:expreience:111",
	"name" : "Voltage Stabilizer",
	"Model" : "EM4160+ Digital",
	"user_for" : "AC, TV"
},{
	"exoerience_id" : 2,
	"expreience_resource_key" : "src:express:expreience:222",
	"name" : "CPU",
	"model" : "LG-364",
	"userd-for" : "computer"
},{
	"exoerience_id" : 3,
	"expreience_resource_key" : "src:express:expreience:333",
	"name" : "UPS",
	"model" : "PHP-214",
	"used-for" : "computer"
},{
	"exoerience_id" : 4,
	"expreience_resource_key" : "src:express:expreience:444",
	"name" : "Key-Board",
	"model" : "KB-235",
	"used-for" : "computer"
},{
	"exoerience_id" : 5,
	"expreience_resource_key" : "src:express:expreience:555",
	"name" : "web-cam",
	"model" : "HP-452",
	"used-for" : "computer"
},{
	"exoerience_id" : 6,
	"expreience_resource_key" : "src:express:expreience:666",
	"name" : "Leggard",
	"model" : "RE-223",
	"used-for" : "bike"
},{
	"exoerience_id" : 7,
	"expreience_resource_key" : "src:express:expreience:777",
	"name" : "Seatcover",
	"model" : "STCV-4242",
	"used-for" : "bike"
},{
	"exoerience_id" : 8,
	"expreience_resource_key" : "src:express:expreience:888",
	"name" : "Stapeny",
	"model" : "TVS-4352",
	"used-for" : "car"
}
]

var attribute = [
{
	"attribute_id" : 1,
	"attribute_resource_key" : "src:express:attribute:111",
	"color" : "Red",
	"ratings" : "4-star",
	"brand" : "ABC"
},
{
	"attribute_id" : 2,
	"attribute_resource_key" : "src:express:attribute:222",
	"color" : "Blue",
	"ratings" : "3-star",
	"brand" : "MNO"
},
{
	"attribute_id" : 3,
	"attribute_resource_key" : "src:express:attribute:333",
	"color" : "Green",
	"ratings" : "4-star",
	"brand" : "XYZ"
},
{
	"attribute_id" : 4,
	"attribute_resource_key" : "src:express:attribute:555",
	"color" : "Yellow",
	"ratings" : "4-star",
	"brand" : "PQR"
},
{
	"attribute_id" : 5,
	"attribute_resource_key" : "src:express:attribute:666",
	"color" : "Black",
	"ratings" : "5-star",
	"brand" : "TVS"
},
]

var product_experience = [
{
	"product_id" : 1,
	"product_name" "Fridge",
	
	"status" : "",
	"created-at" : "",
	"updated-at" : "",
	"experience" : [{
		"experience_id" : 1,
		"experience_name" : "Voltage Stabilizer",
		"type" : "required",
		"attribute" : {
			"attribute_id" : 1,
			"type" : "optional"
		}
	}]
},{
	"product_id" : 2,
	"product_name" : "computer",
	"experience" : [{
		"experience_id" : 2,
		"experience_name" : "CPU",
		"type" : "required",
		"attribute" : [{
			"attribute_id" : 1
		}]
	},{
		"experience_id" : 3,
		"experience_name" "UPS",
		"type" : "optional",
		"attribute" : [{"attribute_id" : 3}]
	},{
		"experience_id": 4,
		"experience_name" : "Key-Board",
		"type" : "required",
		"attribute" : [{"attribute_id" : 2}]
	}]
},{
	"product_id" : 3,
	"product_name" : "leptop",
	"experience" : [{
		"experience_id" : 2,
		"experience_name" : "CPU",
		"type" : "optional",
		"attribute" : [{"attribute_id" : 1}]
	},{
		"experience_id" : 3,
		"experience_name" "UPS",
		"type" : "optional",
		"attribute" : [{"attribute_id" : 4}]
	},{
		"experience_id": 4,
		"experience_name" : "Key-Board",
		"type" : "optional",
		"attribute" : [{"attribute_id" : 5}]
	}]
},{
	"product_id" : 4,
	"product_name" : "bike",
	"experience" : [{
		"experience_id" : 6,
		"experience_name" : "Leggard",
		"type" : "optional",
		"attribute" : [{"attribute_id" : 2}]
	},{
		"experience_id" : 7,
		"experience_name" "Seatcover",
		"type" : "optional",
		"attribute" : [{"attribute_id" : 3}]
	}]
},{
	"product_id" : 5,
	"product_name" : "car",
	"experience" : [{
		"experience_id" : 7,
		"experience_name" : "Seatcover",
		"type" : "optional",
		"attribute" : [{"attribute_id" : 5}]
	},{
		"experience_id" : 8,
		"experience_name" "Stapeny",
		"type" : "optional",
		"attribute" : [{"attribute_id" : 4}]
	}]
}
]



/*
for(let i=0;i<product.length;i++)
	db.product.insert(product[i])

for(let i=0;i<experience.length;i++)
	db.experience.insert(experience[i])

for(let i=0;i<attributes.length;i++)
	db.attributes.insert(attributes[i])

for(let i=0;i<product_experience.length;i++)
	db.product_experience.insert(product_experience[i])
*/

/*
	open cmd, and type "mongo test.js"
	this command will load all the data to the corresponding mongodb. 
*/