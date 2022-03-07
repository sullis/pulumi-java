// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.apimanagement.enums.SubscriptionState;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubscriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionArgs Empty = new SubscriptionArgs();

    /**
     * Determines whether tracing can be enabled
     * 
     */
    @InputImport(name="allowTracing")
      private final @Nullable Input<Boolean> allowTracing;

    public Input<Boolean> getAllowTracing() {
        return this.allowTracing == null ? Input.empty() : this.allowTracing;
    }

    /**
     * Determines the type of application which send the create user request. Default is legacy publisher portal.
     * 
     */
    @InputImport(name="appType")
      private final @Nullable Input<String> appType;

    public Input<String> getAppType() {
        return this.appType == null ? Input.empty() : this.appType;
    }

    /**
     * Subscription name.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Notify change in Subscription State.
     *  - If false, do not send any email notification for change of state of subscription
     *  - If true, send email notification of change of state of subscription
     * 
     */
    @InputImport(name="notify")
      private final @Nullable Input<Boolean> notify;

    public Input<Boolean> getNotify() {
        return this.notify == null ? Input.empty() : this.notify;
    }

    /**
     * User (user id path) for whom subscription is being created in form /users/{userId}
     * 
     */
    @InputImport(name="ownerId")
      private final @Nullable Input<String> ownerId;

    public Input<String> getOwnerId() {
        return this.ownerId == null ? Input.empty() : this.ownerId;
    }

    /**
     * Primary subscription key. If not specified during request key will be generated automatically.
     * 
     */
    @InputImport(name="primaryKey")
      private final @Nullable Input<String> primaryKey;

    public Input<String> getPrimaryKey() {
        return this.primaryKey == null ? Input.empty() : this.primaryKey;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Scope like /products/{productId} or /apis or /apis/{apiId}.
     * 
     */
    @InputImport(name="scope", required=true)
      private final Input<String> scope;

    public Input<String> getScope() {
        return this.scope;
    }

    /**
     * Secondary subscription key. If not specified during request key will be generated automatically.
     * 
     */
    @InputImport(name="secondaryKey")
      private final @Nullable Input<String> secondaryKey;

    public Input<String> getSecondaryKey() {
        return this.secondaryKey == null ? Input.empty() : this.secondaryKey;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
      private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * Subscription entity Identifier. The entity represents the association between a user and a product in API Management.
     * 
     */
    @InputImport(name="sid")
      private final @Nullable Input<String> sid;

    public Input<String> getSid() {
        return this.sid == null ? Input.empty() : this.sid;
    }

    /**
     * Initial subscription state. If no value is specified, subscription is created with Submitted state. Possible states are * active – the subscription is active, * suspended – the subscription is blocked, and the subscriber cannot call any APIs of the product, * submitted – the subscription request has been made by the developer, but has not yet been approved or rejected, * rejected – the subscription request has been denied by an administrator, * cancelled – the subscription has been cancelled by the developer or administrator, * expired – the subscription reached its expiration date and was deactivated.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<SubscriptionState> state;

    public Input<SubscriptionState> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public SubscriptionArgs(
        @Nullable Input<Boolean> allowTracing,
        @Nullable Input<String> appType,
        Input<String> displayName,
        @Nullable Input<Boolean> notify,
        @Nullable Input<String> ownerId,
        @Nullable Input<String> primaryKey,
        Input<String> resourceGroupName,
        Input<String> scope,
        @Nullable Input<String> secondaryKey,
        Input<String> serviceName,
        @Nullable Input<String> sid,
        @Nullable Input<SubscriptionState> state) {
        this.allowTracing = allowTracing;
        this.appType = appType;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.notify = notify;
        this.ownerId = ownerId;
        this.primaryKey = primaryKey;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.secondaryKey = secondaryKey;
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.sid = sid;
        this.state = state;
    }

    private SubscriptionArgs() {
        this.allowTracing = Input.empty();
        this.appType = Input.empty();
        this.displayName = Input.empty();
        this.notify = Input.empty();
        this.ownerId = Input.empty();
        this.primaryKey = Input.empty();
        this.resourceGroupName = Input.empty();
        this.scope = Input.empty();
        this.secondaryKey = Input.empty();
        this.serviceName = Input.empty();
        this.sid = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowTracing;
        private @Nullable Input<String> appType;
        private Input<String> displayName;
        private @Nullable Input<Boolean> notify;
        private @Nullable Input<String> ownerId;
        private @Nullable Input<String> primaryKey;
        private Input<String> resourceGroupName;
        private Input<String> scope;
        private @Nullable Input<String> secondaryKey;
        private Input<String> serviceName;
        private @Nullable Input<String> sid;
        private @Nullable Input<SubscriptionState> state;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowTracing = defaults.allowTracing;
    	      this.appType = defaults.appType;
    	      this.displayName = defaults.displayName;
    	      this.notify = defaults.notify;
    	      this.ownerId = defaults.ownerId;
    	      this.primaryKey = defaults.primaryKey;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scope = defaults.scope;
    	      this.secondaryKey = defaults.secondaryKey;
    	      this.serviceName = defaults.serviceName;
    	      this.sid = defaults.sid;
    	      this.state = defaults.state;
        }

        public Builder setAllowTracing(@Nullable Input<Boolean> allowTracing) {
            this.allowTracing = allowTracing;
            return this;
        }

        public Builder setAllowTracing(@Nullable Boolean allowTracing) {
            this.allowTracing = Input.ofNullable(allowTracing);
            return this;
        }

        public Builder setAppType(@Nullable Input<String> appType) {
            this.appType = appType;
            return this;
        }

        public Builder setAppType(@Nullable String appType) {
            this.appType = Input.ofNullable(appType);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setNotify(@Nullable Input<Boolean> notify) {
            this.notify = notify;
            return this;
        }

        public Builder setNotify(@Nullable Boolean notify) {
            this.notify = Input.ofNullable(notify);
            return this;
        }

        public Builder setOwnerId(@Nullable Input<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setOwnerId(@Nullable String ownerId) {
            this.ownerId = Input.ofNullable(ownerId);
            return this;
        }

        public Builder setPrimaryKey(@Nullable Input<String> primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }

        public Builder setPrimaryKey(@Nullable String primaryKey) {
            this.primaryKey = Input.ofNullable(primaryKey);
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

        public Builder setScope(Input<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Input.of(Objects.requireNonNull(scope));
            return this;
        }

        public Builder setSecondaryKey(@Nullable Input<String> secondaryKey) {
            this.secondaryKey = secondaryKey;
            return this;
        }

        public Builder setSecondaryKey(@Nullable String secondaryKey) {
            this.secondaryKey = Input.ofNullable(secondaryKey);
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder setSid(@Nullable Input<String> sid) {
            this.sid = sid;
            return this;
        }

        public Builder setSid(@Nullable String sid) {
            this.sid = Input.ofNullable(sid);
            return this;
        }

        public Builder setState(@Nullable Input<SubscriptionState> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable SubscriptionState state) {
            this.state = Input.ofNullable(state);
            return this;
        }
        public SubscriptionArgs build() {
            return new SubscriptionArgs(allowTracing, appType, displayName, notify, ownerId, primaryKey, resourceGroupName, scope, secondaryKey, serviceName, sid, state);
        }
    }
}