// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssoadmin;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PermissionSetInlinePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PermissionSetInlinePolicyArgs Empty = new PermissionSetInlinePolicyArgs();

    /**
     * The IAM inline policy to attach to a Permission Set.
     * 
     */
    @Import(name="inlinePolicy", required=true)
    private Output<String> inlinePolicy;

    /**
     * @return The IAM inline policy to attach to a Permission Set.
     * 
     */
    public Output<String> inlinePolicy() {
        return this.inlinePolicy;
    }

    /**
     * The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     * 
     */
    @Import(name="instanceArn", required=true)
    private Output<String> instanceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     * 
     */
    public Output<String> instanceArn() {
        return this.instanceArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Permission Set.
     * 
     */
    @Import(name="permissionSetArn", required=true)
    private Output<String> permissionSetArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Permission Set.
     * 
     */
    public Output<String> permissionSetArn() {
        return this.permissionSetArn;
    }

    private PermissionSetInlinePolicyArgs() {}

    private PermissionSetInlinePolicyArgs(PermissionSetInlinePolicyArgs $) {
        this.inlinePolicy = $.inlinePolicy;
        this.instanceArn = $.instanceArn;
        this.permissionSetArn = $.permissionSetArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PermissionSetInlinePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PermissionSetInlinePolicyArgs $;

        public Builder() {
            $ = new PermissionSetInlinePolicyArgs();
        }

        public Builder(PermissionSetInlinePolicyArgs defaults) {
            $ = new PermissionSetInlinePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param inlinePolicy The IAM inline policy to attach to a Permission Set.
         * 
         * @return builder
         * 
         */
        public Builder inlinePolicy(Output<String> inlinePolicy) {
            $.inlinePolicy = inlinePolicy;
            return this;
        }

        /**
         * @param inlinePolicy The IAM inline policy to attach to a Permission Set.
         * 
         * @return builder
         * 
         */
        public Builder inlinePolicy(String inlinePolicy) {
            return inlinePolicy(Output.of(inlinePolicy));
        }

        /**
         * @param instanceArn The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
         * 
         * @return builder
         * 
         */
        public Builder instanceArn(Output<String> instanceArn) {
            $.instanceArn = instanceArn;
            return this;
        }

        /**
         * @param instanceArn The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
         * 
         * @return builder
         * 
         */
        public Builder instanceArn(String instanceArn) {
            return instanceArn(Output.of(instanceArn));
        }

        /**
         * @param permissionSetArn The Amazon Resource Name (ARN) of the Permission Set.
         * 
         * @return builder
         * 
         */
        public Builder permissionSetArn(Output<String> permissionSetArn) {
            $.permissionSetArn = permissionSetArn;
            return this;
        }

        /**
         * @param permissionSetArn The Amazon Resource Name (ARN) of the Permission Set.
         * 
         * @return builder
         * 
         */
        public Builder permissionSetArn(String permissionSetArn) {
            return permissionSetArn(Output.of(permissionSetArn));
        }

        public PermissionSetInlinePolicyArgs build() {
            $.inlinePolicy = Objects.requireNonNull($.inlinePolicy, "expected parameter 'inlinePolicy' to be non-null");
            $.instanceArn = Objects.requireNonNull($.instanceArn, "expected parameter 'instanceArn' to be non-null");
            $.permissionSetArn = Objects.requireNonNull($.permissionSetArn, "expected parameter 'permissionSetArn' to be non-null");
            return $;
        }
    }

}
