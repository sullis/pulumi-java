// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssoadmin.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedPolicyAttachmentState extends io.pulumi.resources.ResourceArgs {

    public static final ManagedPolicyAttachmentState Empty = new ManagedPolicyAttachmentState();

    /**
     * The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     * 
     */
    @Import(name="instanceArn")
      private final @Nullable Output<String> instanceArn;

    public Output<String> instanceArn() {
        return this.instanceArn == null ? Codegen.empty() : this.instanceArn;
    }

    /**
     * The IAM managed policy Amazon Resource Name (ARN) to be attached to the Permission Set.
     * 
     */
    @Import(name="managedPolicyArn")
      private final @Nullable Output<String> managedPolicyArn;

    public Output<String> managedPolicyArn() {
        return this.managedPolicyArn == null ? Codegen.empty() : this.managedPolicyArn;
    }

    /**
     * The name of the IAM Managed Policy.
     * 
     */
    @Import(name="managedPolicyName")
      private final @Nullable Output<String> managedPolicyName;

    public Output<String> managedPolicyName() {
        return this.managedPolicyName == null ? Codegen.empty() : this.managedPolicyName;
    }

    /**
     * The Amazon Resource Name (ARN) of the Permission Set.
     * 
     */
    @Import(name="permissionSetArn")
      private final @Nullable Output<String> permissionSetArn;

    public Output<String> permissionSetArn() {
        return this.permissionSetArn == null ? Codegen.empty() : this.permissionSetArn;
    }

    public ManagedPolicyAttachmentState(
        @Nullable Output<String> instanceArn,
        @Nullable Output<String> managedPolicyArn,
        @Nullable Output<String> managedPolicyName,
        @Nullable Output<String> permissionSetArn) {
        this.instanceArn = instanceArn;
        this.managedPolicyArn = managedPolicyArn;
        this.managedPolicyName = managedPolicyName;
        this.permissionSetArn = permissionSetArn;
    }

    private ManagedPolicyAttachmentState() {
        this.instanceArn = Codegen.empty();
        this.managedPolicyArn = Codegen.empty();
        this.managedPolicyName = Codegen.empty();
        this.permissionSetArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedPolicyAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> instanceArn;
        private @Nullable Output<String> managedPolicyArn;
        private @Nullable Output<String> managedPolicyName;
        private @Nullable Output<String> permissionSetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedPolicyAttachmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceArn = defaults.instanceArn;
    	      this.managedPolicyArn = defaults.managedPolicyArn;
    	      this.managedPolicyName = defaults.managedPolicyName;
    	      this.permissionSetArn = defaults.permissionSetArn;
        }

        public Builder instanceArn(@Nullable Output<String> instanceArn) {
            this.instanceArn = instanceArn;
            return this;
        }
        public Builder instanceArn(@Nullable String instanceArn) {
            this.instanceArn = Codegen.ofNullable(instanceArn);
            return this;
        }
        public Builder managedPolicyArn(@Nullable Output<String> managedPolicyArn) {
            this.managedPolicyArn = managedPolicyArn;
            return this;
        }
        public Builder managedPolicyArn(@Nullable String managedPolicyArn) {
            this.managedPolicyArn = Codegen.ofNullable(managedPolicyArn);
            return this;
        }
        public Builder managedPolicyName(@Nullable Output<String> managedPolicyName) {
            this.managedPolicyName = managedPolicyName;
            return this;
        }
        public Builder managedPolicyName(@Nullable String managedPolicyName) {
            this.managedPolicyName = Codegen.ofNullable(managedPolicyName);
            return this;
        }
        public Builder permissionSetArn(@Nullable Output<String> permissionSetArn) {
            this.permissionSetArn = permissionSetArn;
            return this;
        }
        public Builder permissionSetArn(@Nullable String permissionSetArn) {
            this.permissionSetArn = Codegen.ofNullable(permissionSetArn);
            return this;
        }        public ManagedPolicyAttachmentState build() {
            return new ManagedPolicyAttachmentState(instanceArn, managedPolicyArn, managedPolicyName, permissionSetArn);
        }
    }
}
