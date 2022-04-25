// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.appengine_v1beta.inputs.ApiEndpointHandlerResponse;
import com.pulumi.googlenative.appengine_v1beta.inputs.ScriptHandlerResponse;
import com.pulumi.googlenative.appengine_v1beta.inputs.StaticFilesHandlerResponse;
import java.lang.String;
import java.util.Objects;


/**
 * URL pattern and description of how the URL should be handled. App Engine can handle URLs by executing application code or by serving static files uploaded with the version, such as images, CSS, or JavaScript.
 * 
 */
public final class UrlMapResponse extends com.pulumi.resources.InvokeArgs {

    public static final UrlMapResponse Empty = new UrlMapResponse();

    /**
     * Uses API Endpoints to handle requests.
     * 
     */
    @Import(name="apiEndpoint", required=true)
    private ApiEndpointHandlerResponse apiEndpoint;

    /**
     * @return Uses API Endpoints to handle requests.
     * 
     */
    public ApiEndpointHandlerResponse apiEndpoint() {
        return this.apiEndpoint;
    }

    /**
     * Action to take when users access resources that require authentication. Defaults to redirect.
     * 
     */
    @Import(name="authFailAction", required=true)
    private String authFailAction;

    /**
     * @return Action to take when users access resources that require authentication. Defaults to redirect.
     * 
     */
    public String authFailAction() {
        return this.authFailAction;
    }

    /**
     * Level of login required to access this resource. Not supported for Node.js in the App Engine standard environment.
     * 
     */
    @Import(name="login", required=true)
    private String login;

    /**
     * @return Level of login required to access this resource. Not supported for Node.js in the App Engine standard environment.
     * 
     */
    public String login() {
        return this.login;
    }

    /**
     * 30x code to use when performing redirects for the secure field. Defaults to 302.
     * 
     */
    @Import(name="redirectHttpResponseCode", required=true)
    private String redirectHttpResponseCode;

    /**
     * @return 30x code to use when performing redirects for the secure field. Defaults to 302.
     * 
     */
    public String redirectHttpResponseCode() {
        return this.redirectHttpResponseCode;
    }

    /**
     * Executes a script to handle the requests that match this URL pattern. Only the auto value is supported for Node.js in the App Engine standard environment, for example &#34;script&#34;: &#34;auto&#34;.
     * 
     */
    @Import(name="script", required=true)
    private ScriptHandlerResponse script;

    /**
     * @return Executes a script to handle the requests that match this URL pattern. Only the auto value is supported for Node.js in the App Engine standard environment, for example &#34;script&#34;: &#34;auto&#34;.
     * 
     */
    public ScriptHandlerResponse script() {
        return this.script;
    }

    /**
     * Security (HTTPS) enforcement for this URL.
     * 
     */
    @Import(name="securityLevel", required=true)
    private String securityLevel;

    /**
     * @return Security (HTTPS) enforcement for this URL.
     * 
     */
    public String securityLevel() {
        return this.securityLevel;
    }

    /**
     * Returns the contents of a file, such as an image, as the response.
     * 
     */
    @Import(name="staticFiles", required=true)
    private StaticFilesHandlerResponse staticFiles;

    /**
     * @return Returns the contents of a file, such as an image, as the response.
     * 
     */
    public StaticFilesHandlerResponse staticFiles() {
        return this.staticFiles;
    }

    /**
     * URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings. All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
     * 
     */
    @Import(name="urlRegex", required=true)
    private String urlRegex;

    /**
     * @return URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings. All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
     * 
     */
    public String urlRegex() {
        return this.urlRegex;
    }

    private UrlMapResponse() {}

    private UrlMapResponse(UrlMapResponse $) {
        this.apiEndpoint = $.apiEndpoint;
        this.authFailAction = $.authFailAction;
        this.login = $.login;
        this.redirectHttpResponseCode = $.redirectHttpResponseCode;
        this.script = $.script;
        this.securityLevel = $.securityLevel;
        this.staticFiles = $.staticFiles;
        this.urlRegex = $.urlRegex;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UrlMapResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UrlMapResponse $;

        public Builder() {
            $ = new UrlMapResponse();
        }

        public Builder(UrlMapResponse defaults) {
            $ = new UrlMapResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiEndpoint Uses API Endpoints to handle requests.
         * 
         * @return builder
         * 
         */
        public Builder apiEndpoint(ApiEndpointHandlerResponse apiEndpoint) {
            $.apiEndpoint = apiEndpoint;
            return this;
        }

        /**
         * @param authFailAction Action to take when users access resources that require authentication. Defaults to redirect.
         * 
         * @return builder
         * 
         */
        public Builder authFailAction(String authFailAction) {
            $.authFailAction = authFailAction;
            return this;
        }

        /**
         * @param login Level of login required to access this resource. Not supported for Node.js in the App Engine standard environment.
         * 
         * @return builder
         * 
         */
        public Builder login(String login) {
            $.login = login;
            return this;
        }

        /**
         * @param redirectHttpResponseCode 30x code to use when performing redirects for the secure field. Defaults to 302.
         * 
         * @return builder
         * 
         */
        public Builder redirectHttpResponseCode(String redirectHttpResponseCode) {
            $.redirectHttpResponseCode = redirectHttpResponseCode;
            return this;
        }

        /**
         * @param script Executes a script to handle the requests that match this URL pattern. Only the auto value is supported for Node.js in the App Engine standard environment, for example &#34;script&#34;: &#34;auto&#34;.
         * 
         * @return builder
         * 
         */
        public Builder script(ScriptHandlerResponse script) {
            $.script = script;
            return this;
        }

        /**
         * @param securityLevel Security (HTTPS) enforcement for this URL.
         * 
         * @return builder
         * 
         */
        public Builder securityLevel(String securityLevel) {
            $.securityLevel = securityLevel;
            return this;
        }

        /**
         * @param staticFiles Returns the contents of a file, such as an image, as the response.
         * 
         * @return builder
         * 
         */
        public Builder staticFiles(StaticFilesHandlerResponse staticFiles) {
            $.staticFiles = staticFiles;
            return this;
        }

        /**
         * @param urlRegex URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings. All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
         * 
         * @return builder
         * 
         */
        public Builder urlRegex(String urlRegex) {
            $.urlRegex = urlRegex;
            return this;
        }

        public UrlMapResponse build() {
            $.apiEndpoint = Objects.requireNonNull($.apiEndpoint, "expected parameter 'apiEndpoint' to be non-null");
            $.authFailAction = Objects.requireNonNull($.authFailAction, "expected parameter 'authFailAction' to be non-null");
            $.login = Objects.requireNonNull($.login, "expected parameter 'login' to be non-null");
            $.redirectHttpResponseCode = Objects.requireNonNull($.redirectHttpResponseCode, "expected parameter 'redirectHttpResponseCode' to be non-null");
            $.script = Objects.requireNonNull($.script, "expected parameter 'script' to be non-null");
            $.securityLevel = Objects.requireNonNull($.securityLevel, "expected parameter 'securityLevel' to be non-null");
            $.staticFiles = Objects.requireNonNull($.staticFiles, "expected parameter 'staticFiles' to be non-null");
            $.urlRegex = Objects.requireNonNull($.urlRegex, "expected parameter 'urlRegex' to be non-null");
            return $;
        }
    }

}
