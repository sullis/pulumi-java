// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sso;

import io.pulumi.awsnative.sso.inputs.PermissionSetTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PermissionSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PermissionSetArgs Empty = new PermissionSetArgs();

    /**
     * The permission set description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The inline policy to put in permission set.
     * 
     */
    @InputImport(name="inlinePolicy")
    private final @Nullable Input<Object> inlinePolicy;

    public Input<Object> getInlinePolicy() {
        return this.inlinePolicy == null ? Input.empty() : this.inlinePolicy;
    }

    /**
     * The sso instance arn that the permission set is owned.
     * 
     */
    @InputImport(name="instanceArn", required=true)
    private final Input<String> instanceArn;

    public Input<String> getInstanceArn() {
        return this.instanceArn;
    }

    @InputImport(name="managedPolicies")
    private final @Nullable Input<List<String>> managedPolicies;

    public Input<List<String>> getManagedPolicies() {
        return this.managedPolicies == null ? Input.empty() : this.managedPolicies;
    }

    /**
     * The name you want to assign to this permission set.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The relay state URL that redirect links to any service in the AWS Management Console.
     * 
     */
    @InputImport(name="relayStateType")
    private final @Nullable Input<String> relayStateType;

    public Input<String> getRelayStateType() {
        return this.relayStateType == null ? Input.empty() : this.relayStateType;
    }

    /**
     * The length of time that a user can be signed in to an AWS account.
     * 
     */
    @InputImport(name="sessionDuration")
    private final @Nullable Input<String> sessionDuration;

    public Input<String> getSessionDuration() {
        return this.sessionDuration == null ? Input.empty() : this.sessionDuration;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<PermissionSetTagArgs>> tags;

    public Input<List<PermissionSetTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public PermissionSetArgs(
        @Nullable Input<String> description,
        @Nullable Input<Object> inlinePolicy,
        Input<String> instanceArn,
        @Nullable Input<List<String>> managedPolicies,
        @Nullable Input<String> name,
        @Nullable Input<String> relayStateType,
        @Nullable Input<String> sessionDuration,
        @Nullable Input<List<PermissionSetTagArgs>> tags) {
        this.description = description;
        this.inlinePolicy = inlinePolicy;
        this.instanceArn = Objects.requireNonNull(instanceArn, "expected parameter 'instanceArn' to be non-null");
        this.managedPolicies = managedPolicies;
        this.name = name;
        this.relayStateType = relayStateType;
        this.sessionDuration = sessionDuration;
        this.tags = tags;
    }

    private PermissionSetArgs() {
        this.description = Input.empty();
        this.inlinePolicy = Input.empty();
        this.instanceArn = Input.empty();
        this.managedPolicies = Input.empty();
        this.name = Input.empty();
        this.relayStateType = Input.empty();
        this.sessionDuration = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Object> inlinePolicy;
        private Input<String> instanceArn;
        private @Nullable Input<List<String>> managedPolicies;
        private @Nullable Input<String> name;
        private @Nullable Input<String> relayStateType;
        private @Nullable Input<String> sessionDuration;
        private @Nullable Input<List<PermissionSetTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.inlinePolicy = defaults.inlinePolicy;
    	      this.instanceArn = defaults.instanceArn;
    	      this.managedPolicies = defaults.managedPolicies;
    	      this.name = defaults.name;
    	      this.relayStateType = defaults.relayStateType;
    	      this.sessionDuration = defaults.sessionDuration;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setInlinePolicy(@Nullable Input<Object> inlinePolicy) {
            this.inlinePolicy = inlinePolicy;
            return this;
        }

        public Builder setInlinePolicy(@Nullable Object inlinePolicy) {
            this.inlinePolicy = Input.ofNullable(inlinePolicy);
            return this;
        }

        public Builder setInstanceArn(Input<String> instanceArn) {
            this.instanceArn = Objects.requireNonNull(instanceArn);
            return this;
        }

        public Builder setInstanceArn(String instanceArn) {
            this.instanceArn = Input.of(Objects.requireNonNull(instanceArn));
            return this;
        }

        public Builder setManagedPolicies(@Nullable Input<List<String>> managedPolicies) {
            this.managedPolicies = managedPolicies;
            return this;
        }

        public Builder setManagedPolicies(@Nullable List<String> managedPolicies) {
            this.managedPolicies = Input.ofNullable(managedPolicies);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRelayStateType(@Nullable Input<String> relayStateType) {
            this.relayStateType = relayStateType;
            return this;
        }

        public Builder setRelayStateType(@Nullable String relayStateType) {
            this.relayStateType = Input.ofNullable(relayStateType);
            return this;
        }

        public Builder setSessionDuration(@Nullable Input<String> sessionDuration) {
            this.sessionDuration = sessionDuration;
            return this;
        }

        public Builder setSessionDuration(@Nullable String sessionDuration) {
            this.sessionDuration = Input.ofNullable(sessionDuration);
            return this;
        }

        public Builder setTags(@Nullable Input<List<PermissionSetTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<PermissionSetTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public PermissionSetArgs build() {
            return new PermissionSetArgs(description, inlinePolicy, instanceArn, managedPolicies, name, relayStateType, sessionDuration, tags);
        }
    }
}
