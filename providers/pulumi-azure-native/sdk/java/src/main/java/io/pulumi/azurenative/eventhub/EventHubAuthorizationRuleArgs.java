// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.azurenative.eventhub.enums.AccessRights;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventHubAuthorizationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventHubAuthorizationRuleArgs Empty = new EventHubAuthorizationRuleArgs();

    /**
     * The authorization rule name.
     * 
     */
    @InputImport(name="authorizationRuleName")
    private final @Nullable Input<String> authorizationRuleName;

    public Input<String> getAuthorizationRuleName() {
        return this.authorizationRuleName == null ? Input.empty() : this.authorizationRuleName;
    }

    /**
     * The Event Hub name
     * 
     */
    @InputImport(name="eventHubName", required=true)
    private final Input<String> eventHubName;

    public Input<String> getEventHubName() {
        return this.eventHubName;
    }

    /**
     * The Namespace name
     * 
     */
    @InputImport(name="namespaceName", required=true)
    private final Input<String> namespaceName;

    public Input<String> getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the resource group within the azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The rights associated with the rule.
     * 
     */
    @InputImport(name="rights", required=true)
    private final Input<List<Either<String,AccessRights>>> rights;

    public Input<List<Either<String,AccessRights>>> getRights() {
        return this.rights;
    }

    public EventHubAuthorizationRuleArgs(
        @Nullable Input<String> authorizationRuleName,
        Input<String> eventHubName,
        Input<String> namespaceName,
        Input<String> resourceGroupName,
        Input<List<Either<String,AccessRights>>> rights) {
        this.authorizationRuleName = authorizationRuleName;
        this.eventHubName = Objects.requireNonNull(eventHubName, "expected parameter 'eventHubName' to be non-null");
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.rights = Objects.requireNonNull(rights, "expected parameter 'rights' to be non-null");
    }

    private EventHubAuthorizationRuleArgs() {
        this.authorizationRuleName = Input.empty();
        this.eventHubName = Input.empty();
        this.namespaceName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.rights = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubAuthorizationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> authorizationRuleName;
        private Input<String> eventHubName;
        private Input<String> namespaceName;
        private Input<String> resourceGroupName;
        private Input<List<Either<String,AccessRights>>> rights;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHubAuthorizationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationRuleName = defaults.authorizationRuleName;
    	      this.eventHubName = defaults.eventHubName;
    	      this.namespaceName = defaults.namespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.rights = defaults.rights;
        }

        public Builder setAuthorizationRuleName(@Nullable Input<String> authorizationRuleName) {
            this.authorizationRuleName = authorizationRuleName;
            return this;
        }

        public Builder setAuthorizationRuleName(@Nullable String authorizationRuleName) {
            this.authorizationRuleName = Input.ofNullable(authorizationRuleName);
            return this;
        }

        public Builder setEventHubName(Input<String> eventHubName) {
            this.eventHubName = Objects.requireNonNull(eventHubName);
            return this;
        }

        public Builder setEventHubName(String eventHubName) {
            this.eventHubName = Input.of(Objects.requireNonNull(eventHubName));
            return this;
        }

        public Builder setNamespaceName(Input<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder setNamespaceName(String namespaceName) {
            this.namespaceName = Input.of(Objects.requireNonNull(namespaceName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRights(Input<List<Either<String,AccessRights>>> rights) {
            this.rights = Objects.requireNonNull(rights);
            return this;
        }

        public Builder setRights(List<Either<String,AccessRights>> rights) {
            this.rights = Input.of(Objects.requireNonNull(rights));
            return this;
        }

        public EventHubAuthorizationRuleArgs build() {
            return new EventHubAuthorizationRuleArgs(authorizationRuleName, eventHubName, namespaceName, resourceGroupName, rights);
        }
    }
}
