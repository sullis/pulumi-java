// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.PolicyEnabledState;
import io.pulumi.azurenative.network.enums.PolicyMode;
import io.pulumi.azurenative.network.enums.PolicyRequestBodyCheck;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines top-level WebApplicationFirewallPolicy configuration settings.
 * 
 */
public final class FrontDoorPolicySettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final FrontDoorPolicySettingsArgs Empty = new FrontDoorPolicySettingsArgs();

    /**
     * If the action type is block, customer can override the response body. The body must be specified in base64 encoding.
     * 
     */
    @InputImport(name="customBlockResponseBody")
    private final @Nullable Input<String> customBlockResponseBody;

    public Input<String> getCustomBlockResponseBody() {
        return this.customBlockResponseBody == null ? Input.empty() : this.customBlockResponseBody;
    }

    /**
     * If the action type is block, customer can override the response status code.
     * 
     */
    @InputImport(name="customBlockResponseStatusCode")
    private final @Nullable Input<Integer> customBlockResponseStatusCode;

    public Input<Integer> getCustomBlockResponseStatusCode() {
        return this.customBlockResponseStatusCode == null ? Input.empty() : this.customBlockResponseStatusCode;
    }

    /**
     * Describes if the policy is in enabled or disabled state. Defaults to Enabled if not specified.
     * 
     */
    @InputImport(name="enabledState")
    private final @Nullable Input<Either<String,PolicyEnabledState>> enabledState;

    public Input<Either<String,PolicyEnabledState>> getEnabledState() {
        return this.enabledState == null ? Input.empty() : this.enabledState;
    }

    /**
     * Describes if it is in detection mode or prevention mode at policy level.
     * 
     */
    @InputImport(name="mode")
    private final @Nullable Input<Either<String,PolicyMode>> mode;

    public Input<Either<String,PolicyMode>> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * If action type is redirect, this field represents redirect URL for the client.
     * 
     */
    @InputImport(name="redirectUrl")
    private final @Nullable Input<String> redirectUrl;

    public Input<String> getRedirectUrl() {
        return this.redirectUrl == null ? Input.empty() : this.redirectUrl;
    }

    /**
     * Describes if policy managed rules will inspect the request body content.
     * 
     */
    @InputImport(name="requestBodyCheck")
    private final @Nullable Input<Either<String,PolicyRequestBodyCheck>> requestBodyCheck;

    public Input<Either<String,PolicyRequestBodyCheck>> getRequestBodyCheck() {
        return this.requestBodyCheck == null ? Input.empty() : this.requestBodyCheck;
    }

    public FrontDoorPolicySettingsArgs(
        @Nullable Input<String> customBlockResponseBody,
        @Nullable Input<Integer> customBlockResponseStatusCode,
        @Nullable Input<Either<String,PolicyEnabledState>> enabledState,
        @Nullable Input<Either<String,PolicyMode>> mode,
        @Nullable Input<String> redirectUrl,
        @Nullable Input<Either<String,PolicyRequestBodyCheck>> requestBodyCheck) {
        this.customBlockResponseBody = customBlockResponseBody;
        this.customBlockResponseStatusCode = customBlockResponseStatusCode;
        this.enabledState = enabledState;
        this.mode = mode;
        this.redirectUrl = redirectUrl;
        this.requestBodyCheck = requestBodyCheck;
    }

    private FrontDoorPolicySettingsArgs() {
        this.customBlockResponseBody = Input.empty();
        this.customBlockResponseStatusCode = Input.empty();
        this.enabledState = Input.empty();
        this.mode = Input.empty();
        this.redirectUrl = Input.empty();
        this.requestBodyCheck = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontDoorPolicySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> customBlockResponseBody;
        private @Nullable Input<Integer> customBlockResponseStatusCode;
        private @Nullable Input<Either<String,PolicyEnabledState>> enabledState;
        private @Nullable Input<Either<String,PolicyMode>> mode;
        private @Nullable Input<String> redirectUrl;
        private @Nullable Input<Either<String,PolicyRequestBodyCheck>> requestBodyCheck;

        public Builder() {
    	      // Empty
        }

        public Builder(FrontDoorPolicySettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customBlockResponseBody = defaults.customBlockResponseBody;
    	      this.customBlockResponseStatusCode = defaults.customBlockResponseStatusCode;
    	      this.enabledState = defaults.enabledState;
    	      this.mode = defaults.mode;
    	      this.redirectUrl = defaults.redirectUrl;
    	      this.requestBodyCheck = defaults.requestBodyCheck;
        }

        public Builder setCustomBlockResponseBody(@Nullable Input<String> customBlockResponseBody) {
            this.customBlockResponseBody = customBlockResponseBody;
            return this;
        }

        public Builder setCustomBlockResponseBody(@Nullable String customBlockResponseBody) {
            this.customBlockResponseBody = Input.ofNullable(customBlockResponseBody);
            return this;
        }

        public Builder setCustomBlockResponseStatusCode(@Nullable Input<Integer> customBlockResponseStatusCode) {
            this.customBlockResponseStatusCode = customBlockResponseStatusCode;
            return this;
        }

        public Builder setCustomBlockResponseStatusCode(@Nullable Integer customBlockResponseStatusCode) {
            this.customBlockResponseStatusCode = Input.ofNullable(customBlockResponseStatusCode);
            return this;
        }

        public Builder setEnabledState(@Nullable Input<Either<String,PolicyEnabledState>> enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder setEnabledState(@Nullable Either<String,PolicyEnabledState> enabledState) {
            this.enabledState = Input.ofNullable(enabledState);
            return this;
        }

        public Builder setMode(@Nullable Input<Either<String,PolicyMode>> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable Either<String,PolicyMode> mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setRedirectUrl(@Nullable Input<String> redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }

        public Builder setRedirectUrl(@Nullable String redirectUrl) {
            this.redirectUrl = Input.ofNullable(redirectUrl);
            return this;
        }

        public Builder setRequestBodyCheck(@Nullable Input<Either<String,PolicyRequestBodyCheck>> requestBodyCheck) {
            this.requestBodyCheck = requestBodyCheck;
            return this;
        }

        public Builder setRequestBodyCheck(@Nullable Either<String,PolicyRequestBodyCheck> requestBodyCheck) {
            this.requestBodyCheck = Input.ofNullable(requestBodyCheck);
            return this;
        }

        public FrontDoorPolicySettingsArgs build() {
            return new FrontDoorPolicySettingsArgs(customBlockResponseBody, customBlockResponseStatusCode, enabledState, mode, redirectUrl, requestBodyCheck);
        }
    }
}
