// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.enums.SecurityPolicyRuleRedirectOptionsType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityPolicyRuleRedirectOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleRedirectOptionsArgs Empty = new SecurityPolicyRuleRedirectOptionsArgs();

    /**
     * Target for the redirect action. This is required if the type is EXTERNAL_302 and cannot be specified for GOOGLE_RECAPTCHA.
     * 
     */
    @Import(name="target")
    private @Nullable Output<String> target;

    /**
     * @return Target for the redirect action. This is required if the type is EXTERNAL_302 and cannot be specified for GOOGLE_RECAPTCHA.
     * 
     */
    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    /**
     * Type of the redirect action.
     * 
     */
    @Import(name="type")
    private @Nullable Output<SecurityPolicyRuleRedirectOptionsType> type;

    /**
     * @return Type of the redirect action.
     * 
     */
    public Optional<Output<SecurityPolicyRuleRedirectOptionsType>> type() {
        return Optional.ofNullable(this.type);
    }

    private SecurityPolicyRuleRedirectOptionsArgs() {}

    private SecurityPolicyRuleRedirectOptionsArgs(SecurityPolicyRuleRedirectOptionsArgs $) {
        this.target = $.target;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPolicyRuleRedirectOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyRuleRedirectOptionsArgs $;

        public Builder() {
            $ = new SecurityPolicyRuleRedirectOptionsArgs();
        }

        public Builder(SecurityPolicyRuleRedirectOptionsArgs defaults) {
            $ = new SecurityPolicyRuleRedirectOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param target Target for the redirect action. This is required if the type is EXTERNAL_302 and cannot be specified for GOOGLE_RECAPTCHA.
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target Target for the redirect action. This is required if the type is EXTERNAL_302 and cannot be specified for GOOGLE_RECAPTCHA.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        /**
         * @param type Type of the redirect action.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<SecurityPolicyRuleRedirectOptionsType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the redirect action.
         * 
         * @return builder
         * 
         */
        public Builder type(SecurityPolicyRuleRedirectOptionsType type) {
            return type(Output.of(type));
        }

        public SecurityPolicyRuleRedirectOptionsArgs build() {
            return $;
        }
    }

}
