package org.baaahs.layouts

data class Page(val title: String, val href: String, val isNew: Boolean = false)

val pages = mapOf(
    "landings" to listOf(
        Page("Mobile App", "/mobile-app"),
        Page("Desktop App", "/desktop-app"),
        Page("Startup", "/startup"),
        Page("Expo", "/expo"),
        Page("Marketing", "/"),
        Page("Service", "/service"),
        Page("Enterprise", "/enterprise"),
        Page("Cloud Hosting", "/cloud-hosting"),
        Page("Design Company", "/design-company"),
        Page("Web Basic", "/web-basic"),
        Page("Overview", "/home"),
        Page("Agency", "/agency"),
        Page("E-Learning", "/e-learning"),
        Page("Coworking", "/coworking"),
        Page("Rental", "/rental"),
        Page("Job Listing", "/job-listing"),
        Page("Logistics", "/logistics"),
        Page("E-commerce", "/e-commerce"),
    ),
    "company" to listOf(
        Page("Career Lising", "/career-listing"),
        Page("Job Opening", "/career-opening"),
        Page("Customer Stories", "/customers"),
        Page("Hire Us", "/hire-us"),
        Page("About: Startup", "/about-side-cover"),
        Page("About", "/about"),
        Page("Pricing", "/pricing"),
        Page("Terms", "/company-terms"),
        Page("Contact: Map", "/contact-sidebar-map"),
        Page("Contact: Startup", "/contact-page"),
        Page("Contact: Minimal", "/contact-page-cover"),
    ),
    "account" to listOf(
        Page("General Settings", "/account-general"),
        Page("Security Settings", "/account-security"),
        Page("Notifications Options", "/account-notifications"),
        Page("Billing Options", "/account-billing"),
        Page("Sign up: Simple", "/signup-simple"),
        Page("Sign up: Cover", "/signup-cover"),
        Page("Sign in: Simple", "/signin-simple"),
        Page("Sign in: Cover", "/signin-cover"),
        Page("Password: Simple", "/password-reset-simple"),
        Page("Password: Cover", "/password-reset-cover"),
    ),
    "secondary" to listOf(
        Page("Help Center: Overview", "/help-center"),
        Page("Help Center: Article", "/help-center-article"),
        Page("FAQ", "/faq"),
        Page("Error 404: Simple", "/not-found"),
        Page("Error 404: Cover", "/not-found-cover"),
        Page("Career Page Minimal", "/career-listing-minimal"),
    ),
    "blog" to listOf(
        Page("Reach View", "/blog-reach-view"),
        Page("Search", "/blog-search"),
        Page("Newsroom", "/blog-newsroom"),
        Page("Article", "/blog-article"),
    ),
    "portfolio" to listOf(
        Page("Grid View", "/portfolio-grid"),
        Page("Masonry", "/portfolio-masonry"),
        Page("Basic", "/portfolio-page"),
        Page("Parallax", "/agency"),
    )
)