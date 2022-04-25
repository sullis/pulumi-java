// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebasehosting_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A [`Redirect`](https://firebase.google.com/docs/hosting/full-config#redirects) specifies a URL pattern that, if matched to the request URL path, triggers Hosting to respond with a redirect to the specified destination path.
 * 
 */
public final class RedirectResponse extends com.pulumi.resources.InvokeArgs {

    public static final RedirectResponse Empty = new RedirectResponse();

    /**
     * The user-supplied [glob](https://firebase.google.com/docs/hosting/full-config#glob_pattern_matching) to match against the request URL path.
     * 
     */
    @Import(name="glob", required=true)
    private String glob;

    /**
     * @return The user-supplied [glob](https://firebase.google.com/docs/hosting/full-config#glob_pattern_matching) to match against the request URL path.
     * 
     */
    public String glob() {
        return this.glob;
    }

    /**
     * The value to put in the HTTP location header of the response. The location can contain capture group values from the pattern using a `:` prefix to identify the segment and an optional `*` to capture the rest of the URL. For example: &#34;glob&#34;: &#34;/:capture*&#34;, &#34;statusCode&#34;: 301, &#34;location&#34;: &#34;https://example.com/foo/:capture&#34;
     * 
     */
    @Import(name="location", required=true)
    private String location;

    /**
     * @return The value to put in the HTTP location header of the response. The location can contain capture group values from the pattern using a `:` prefix to identify the segment and an optional `*` to capture the rest of the URL. For example: &#34;glob&#34;: &#34;/:capture*&#34;, &#34;statusCode&#34;: 301, &#34;location&#34;: &#34;https://example.com/foo/:capture&#34;
     * 
     */
    public String location() {
        return this.location;
    }

    /**
     * The user-supplied RE2 regular expression to match against the request URL path.
     * 
     */
    @Import(name="regex", required=true)
    private String regex;

    /**
     * @return The user-supplied RE2 regular expression to match against the request URL path.
     * 
     */
    public String regex() {
        return this.regex;
    }

    /**
     * The status HTTP code to return in the response. It must be a valid 3xx status code.
     * 
     */
    @Import(name="statusCode", required=true)
    private Integer statusCode;

    /**
     * @return The status HTTP code to return in the response. It must be a valid 3xx status code.
     * 
     */
    public Integer statusCode() {
        return this.statusCode;
    }

    private RedirectResponse() {}

    private RedirectResponse(RedirectResponse $) {
        this.glob = $.glob;
        this.location = $.location;
        this.regex = $.regex;
        this.statusCode = $.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RedirectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RedirectResponse $;

        public Builder() {
            $ = new RedirectResponse();
        }

        public Builder(RedirectResponse defaults) {
            $ = new RedirectResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param glob The user-supplied [glob](https://firebase.google.com/docs/hosting/full-config#glob_pattern_matching) to match against the request URL path.
         * 
         * @return builder
         * 
         */
        public Builder glob(String glob) {
            $.glob = glob;
            return this;
        }

        /**
         * @param location The value to put in the HTTP location header of the response. The location can contain capture group values from the pattern using a `:` prefix to identify the segment and an optional `*` to capture the rest of the URL. For example: &#34;glob&#34;: &#34;/:capture*&#34;, &#34;statusCode&#34;: 301, &#34;location&#34;: &#34;https://example.com/foo/:capture&#34;
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            $.location = location;
            return this;
        }

        /**
         * @param regex The user-supplied RE2 regular expression to match against the request URL path.
         * 
         * @return builder
         * 
         */
        public Builder regex(String regex) {
            $.regex = regex;
            return this;
        }

        /**
         * @param statusCode The status HTTP code to return in the response. It must be a valid 3xx status code.
         * 
         * @return builder
         * 
         */
        public Builder statusCode(Integer statusCode) {
            $.statusCode = statusCode;
            return this;
        }

        public RedirectResponse build() {
            $.glob = Objects.requireNonNull($.glob, "expected parameter 'glob' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.regex = Objects.requireNonNull($.regex, "expected parameter 'regex' to be non-null");
            $.statusCode = Objects.requireNonNull($.statusCode, "expected parameter 'statusCode' to be non-null");
            return $;
        }
    }

}
