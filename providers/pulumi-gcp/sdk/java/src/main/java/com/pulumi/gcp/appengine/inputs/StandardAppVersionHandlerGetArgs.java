// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.appengine.inputs.StandardAppVersionHandlerScriptGetArgs;
import com.pulumi.gcp.appengine.inputs.StandardAppVersionHandlerStaticFilesGetArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StandardAppVersionHandlerGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final StandardAppVersionHandlerGetArgs Empty = new StandardAppVersionHandlerGetArgs();

    /**
     * Actions to take when the user is not logged in.
     * Possible values are `AUTH_FAIL_ACTION_REDIRECT` and `AUTH_FAIL_ACTION_UNAUTHORIZED`.
     * 
     */
    @Import(name="authFailAction")
    private @Nullable Output<String> authFailAction;

    /**
     * @return Actions to take when the user is not logged in.
     * Possible values are `AUTH_FAIL_ACTION_REDIRECT` and `AUTH_FAIL_ACTION_UNAUTHORIZED`.
     * 
     */
    public Optional<Output<String>> authFailAction() {
        return Optional.ofNullable(this.authFailAction);
    }

    /**
     * Methods to restrict access to a URL based on login status.
     * Possible values are `LOGIN_OPTIONAL`, `LOGIN_ADMIN`, and `LOGIN_REQUIRED`.
     * 
     */
    @Import(name="login")
    private @Nullable Output<String> login;

    /**
     * @return Methods to restrict access to a URL based on login status.
     * Possible values are `LOGIN_OPTIONAL`, `LOGIN_ADMIN`, and `LOGIN_REQUIRED`.
     * 
     */
    public Optional<Output<String>> login() {
        return Optional.ofNullable(this.login);
    }

    /**
     * 30x code to use when performing redirects for the secure field.
     * Possible values are `REDIRECT_HTTP_RESPONSE_CODE_301`, `REDIRECT_HTTP_RESPONSE_CODE_302`, `REDIRECT_HTTP_RESPONSE_CODE_303`, and `REDIRECT_HTTP_RESPONSE_CODE_307`.
     * 
     */
    @Import(name="redirectHttpResponseCode")
    private @Nullable Output<String> redirectHttpResponseCode;

    /**
     * @return 30x code to use when performing redirects for the secure field.
     * Possible values are `REDIRECT_HTTP_RESPONSE_CODE_301`, `REDIRECT_HTTP_RESPONSE_CODE_302`, `REDIRECT_HTTP_RESPONSE_CODE_303`, and `REDIRECT_HTTP_RESPONSE_CODE_307`.
     * 
     */
    public Optional<Output<String>> redirectHttpResponseCode() {
        return Optional.ofNullable(this.redirectHttpResponseCode);
    }

    /**
     * Executes a script to handle the requests that match this URL pattern.
     * Only the auto value is supported for Node.js in the App Engine standard environment, for example &#34;script:&#34; &#34;auto&#34;.
     * Structure is documented below.
     * 
     */
    @Import(name="script")
    private @Nullable Output<StandardAppVersionHandlerScriptGetArgs> script;

    /**
     * @return Executes a script to handle the requests that match this URL pattern.
     * Only the auto value is supported for Node.js in the App Engine standard environment, for example &#34;script:&#34; &#34;auto&#34;.
     * Structure is documented below.
     * 
     */
    public Optional<Output<StandardAppVersionHandlerScriptGetArgs>> script() {
        return Optional.ofNullable(this.script);
    }

    /**
     * Security (HTTPS) enforcement for this URL.
     * Possible values are `SECURE_DEFAULT`, `SECURE_NEVER`, `SECURE_OPTIONAL`, and `SECURE_ALWAYS`.
     * 
     */
    @Import(name="securityLevel")
    private @Nullable Output<String> securityLevel;

    /**
     * @return Security (HTTPS) enforcement for this URL.
     * Possible values are `SECURE_DEFAULT`, `SECURE_NEVER`, `SECURE_OPTIONAL`, and `SECURE_ALWAYS`.
     * 
     */
    public Optional<Output<String>> securityLevel() {
        return Optional.ofNullable(this.securityLevel);
    }

    /**
     * Files served directly to the user for a given URL, such as images, CSS stylesheets, or JavaScript source files. Static file handlers describe which files in the application directory are static files, and which URLs serve them.
     * Structure is documented below.
     * 
     */
    @Import(name="staticFiles")
    private @Nullable Output<StandardAppVersionHandlerStaticFilesGetArgs> staticFiles;

    /**
     * @return Files served directly to the user for a given URL, such as images, CSS stylesheets, or JavaScript source files. Static file handlers describe which files in the application directory are static files, and which URLs serve them.
     * Structure is documented below.
     * 
     */
    public Optional<Output<StandardAppVersionHandlerStaticFilesGetArgs>> staticFiles() {
        return Optional.ofNullable(this.staticFiles);
    }

    /**
     * URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings.
     * All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
     * 
     */
    @Import(name="urlRegex")
    private @Nullable Output<String> urlRegex;

    /**
     * @return URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings.
     * All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
     * 
     */
    public Optional<Output<String>> urlRegex() {
        return Optional.ofNullable(this.urlRegex);
    }

    private StandardAppVersionHandlerGetArgs() {}

    private StandardAppVersionHandlerGetArgs(StandardAppVersionHandlerGetArgs $) {
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
    public static Builder builder(StandardAppVersionHandlerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StandardAppVersionHandlerGetArgs $;

        public Builder() {
            $ = new StandardAppVersionHandlerGetArgs();
        }

        public Builder(StandardAppVersionHandlerGetArgs defaults) {
            $ = new StandardAppVersionHandlerGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authFailAction Actions to take when the user is not logged in.
         * Possible values are `AUTH_FAIL_ACTION_REDIRECT` and `AUTH_FAIL_ACTION_UNAUTHORIZED`.
         * 
         * @return builder
         * 
         */
        public Builder authFailAction(@Nullable Output<String> authFailAction) {
            $.authFailAction = authFailAction;
            return this;
        }

        /**
         * @param authFailAction Actions to take when the user is not logged in.
         * Possible values are `AUTH_FAIL_ACTION_REDIRECT` and `AUTH_FAIL_ACTION_UNAUTHORIZED`.
         * 
         * @return builder
         * 
         */
        public Builder authFailAction(String authFailAction) {
            return authFailAction(Output.of(authFailAction));
        }

        /**
         * @param login Methods to restrict access to a URL based on login status.
         * Possible values are `LOGIN_OPTIONAL`, `LOGIN_ADMIN`, and `LOGIN_REQUIRED`.
         * 
         * @return builder
         * 
         */
        public Builder login(@Nullable Output<String> login) {
            $.login = login;
            return this;
        }

        /**
         * @param login Methods to restrict access to a URL based on login status.
         * Possible values are `LOGIN_OPTIONAL`, `LOGIN_ADMIN`, and `LOGIN_REQUIRED`.
         * 
         * @return builder
         * 
         */
        public Builder login(String login) {
            return login(Output.of(login));
        }

        /**
         * @param redirectHttpResponseCode 30x code to use when performing redirects for the secure field.
         * Possible values are `REDIRECT_HTTP_RESPONSE_CODE_301`, `REDIRECT_HTTP_RESPONSE_CODE_302`, `REDIRECT_HTTP_RESPONSE_CODE_303`, and `REDIRECT_HTTP_RESPONSE_CODE_307`.
         * 
         * @return builder
         * 
         */
        public Builder redirectHttpResponseCode(@Nullable Output<String> redirectHttpResponseCode) {
            $.redirectHttpResponseCode = redirectHttpResponseCode;
            return this;
        }

        /**
         * @param redirectHttpResponseCode 30x code to use when performing redirects for the secure field.
         * Possible values are `REDIRECT_HTTP_RESPONSE_CODE_301`, `REDIRECT_HTTP_RESPONSE_CODE_302`, `REDIRECT_HTTP_RESPONSE_CODE_303`, and `REDIRECT_HTTP_RESPONSE_CODE_307`.
         * 
         * @return builder
         * 
         */
        public Builder redirectHttpResponseCode(String redirectHttpResponseCode) {
            return redirectHttpResponseCode(Output.of(redirectHttpResponseCode));
        }

        /**
         * @param script Executes a script to handle the requests that match this URL pattern.
         * Only the auto value is supported for Node.js in the App Engine standard environment, for example &#34;script:&#34; &#34;auto&#34;.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder script(@Nullable Output<StandardAppVersionHandlerScriptGetArgs> script) {
            $.script = script;
            return this;
        }

        /**
         * @param script Executes a script to handle the requests that match this URL pattern.
         * Only the auto value is supported for Node.js in the App Engine standard environment, for example &#34;script:&#34; &#34;auto&#34;.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder script(StandardAppVersionHandlerScriptGetArgs script) {
            return script(Output.of(script));
        }

        /**
         * @param securityLevel Security (HTTPS) enforcement for this URL.
         * Possible values are `SECURE_DEFAULT`, `SECURE_NEVER`, `SECURE_OPTIONAL`, and `SECURE_ALWAYS`.
         * 
         * @return builder
         * 
         */
        public Builder securityLevel(@Nullable Output<String> securityLevel) {
            $.securityLevel = securityLevel;
            return this;
        }

        /**
         * @param securityLevel Security (HTTPS) enforcement for this URL.
         * Possible values are `SECURE_DEFAULT`, `SECURE_NEVER`, `SECURE_OPTIONAL`, and `SECURE_ALWAYS`.
         * 
         * @return builder
         * 
         */
        public Builder securityLevel(String securityLevel) {
            return securityLevel(Output.of(securityLevel));
        }

        /**
         * @param staticFiles Files served directly to the user for a given URL, such as images, CSS stylesheets, or JavaScript source files. Static file handlers describe which files in the application directory are static files, and which URLs serve them.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder staticFiles(@Nullable Output<StandardAppVersionHandlerStaticFilesGetArgs> staticFiles) {
            $.staticFiles = staticFiles;
            return this;
        }

        /**
         * @param staticFiles Files served directly to the user for a given URL, such as images, CSS stylesheets, or JavaScript source files. Static file handlers describe which files in the application directory are static files, and which URLs serve them.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder staticFiles(StandardAppVersionHandlerStaticFilesGetArgs staticFiles) {
            return staticFiles(Output.of(staticFiles));
        }

        /**
         * @param urlRegex URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings.
         * All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
         * 
         * @return builder
         * 
         */
        public Builder urlRegex(@Nullable Output<String> urlRegex) {
            $.urlRegex = urlRegex;
            return this;
        }

        /**
         * @param urlRegex URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings.
         * All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
         * 
         * @return builder
         * 
         */
        public Builder urlRegex(String urlRegex) {
            return urlRegex(Output.of(urlRegex));
        }

        public StandardAppVersionHandlerGetArgs build() {
            return $;
        }
    }

}
