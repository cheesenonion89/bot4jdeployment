// This is a manifest file that'll be compiled into application.js.
//
// Any JavaScript cnn_server within this directory can be referenced here using a relative path.
//
// You're free to add application-wide JavaScript to this cnn_server, but it's generally better
// to create separate JavaScript files as needed.
//
//= require jquery-2.2.0.min
//= require bootstrap
//= require_tree .
//= require_self

if (typeof jQuery !== 'undefined') {
    (function($) {
        $(document).ajaxStart(function() {
            $('#spinner').fadeIn();
        }).ajaxStop(function() {
            $('#spinner').fadeOut();
        });
    })(jQuery);
}
