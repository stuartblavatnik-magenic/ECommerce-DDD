workspace "ECommerce Context View" "ECommerce Context View" {

    model {
        shopper = person "Shopper" "Person who purchases items.  This person can also rate items"
        merchant = person "Merchant" "Person who sells items."
	    admin = person "Admin" "Person who administers the system."
        analyst = person "Analyst" "Person who analyzes buying and selling trends"

        ecommerceSoftwareSystem = softwareSystem "E-Commerce System" "Allows for buyers and sellers to purchase and sell goods.  Also allows for business analysists to report on buying and selling trends."

        shopper -> ecommerceSoftwareSystem "Uses"
        merchant -> ecommerceSoftwareSystem "Uses"
	    admin -> ecommerceSoftwareSystem "Uses"
        analyst -> ecommerceSoftwareSystem "Uses"
    }

    views {
        systemContext ecommerceSoftwareSystem {
            include *
            autoLayout
        }

        styles {
            element "Software System" {
                background #1168bd
                color #ffffff
            }
            element "Person" {
                shape person
                background #08427b
                color #ffffff
            }
        }
    }
    
}