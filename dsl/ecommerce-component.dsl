workspace "ECommerce Container View" "ECommerce Container View" {

    model {
        shopper = person "Shopper" "Person who purchases items.  This person can also rate items"
        merchant = person "Merchant" "Person who sells items."
	    admin = person "Admin" "Person who administers the system."
        analyst = person "Analyst" "Person who analyzes buying and selling trends"

        ecommerceSoftwareSystem = softwareSystem "E-Commerce System" "Allows for buyers and sellers to purchase and sell goods.  Also allows for business analysists to report on buying and selling trends." {
            webapp = container "Web Application" "Delivers the static content and the single-page application" "React"
            singlePageApplication = container "Single-Page Application" "Provides functionality to all users via their web browsers" "React"
            database = container "Database" "Stores user profiles and store items" "Postgres"
            apiApplication = container "API Application" "Back End Functionality" "Java SpringBoot"
            mobileApp = container "Mobile Application" "Mobile Interface" "Kotlin"
        }

        shopper -> ecommerceSoftwareSystem "Uses"
        merchant -> ecommerceSoftwareSystem "Uses"
	    admin -> ecommerceSoftwareSystem "Uses"
        analyst -> ecommerceSoftwareSystem "Uses"

        shopper -> ecommerceSoftwareSystem "Uses the application"

        shopper -> webapp "Uses the Web Application to search, buy and return items"
        merchant -> webapp "Uses the Web Application to search, add, remove, sell and restock items"
        admin -> webapp "Uses the admin section of the application for maintanence of the system"
        analyst -> webapp "Uses the system to retrieve statistics for buying and selling trends"

        shopper -> mobileApp "Uses the Mobile Application to search, buy and return items"
        merchant -> mobileApp "Uses the Mobile Application to search, add, remove, sell, and restock items"
	    admin -> mobileApp "Uses the Mobile Application for monitoring and maintenance of the system"
        analyst -> mobileApp "Uses the Mobile Application to receive trending alerts of the system"

        webapp -> singlePageApplication "Webapp sends commands with application"
        singlePageApplication -> apiApplication "Front end communicates with the back end"
        apiApplication -> database "Uses the database to retrieve items, user data"
    }

    views {
        systemContext ecommerceSoftwareSystem {
            include *
            autoLayout
        }

        container ecommerceSoftwareSystem "Containers" {
            include *
            autoLayout
        }

        styles {
            element "Software System" {
                background #1168bd
                color #ffffff
            }
            element "Container" {
                background #1168bd
                color #ffffff
            }
            element "Database" {
                shape Cylinder
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