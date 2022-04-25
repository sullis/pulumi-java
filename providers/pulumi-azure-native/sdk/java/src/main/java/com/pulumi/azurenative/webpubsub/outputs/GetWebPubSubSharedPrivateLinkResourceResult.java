// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.webpubsub.outputs;

import com.pulumi.azurenative.webpubsub.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebPubSubSharedPrivateLinkResourceResult {
    /**
     * @return The group id from the provider of resource the shared private link resource is for
     * 
     */
    private final String groupId;
    /**
     * @return Fully qualified resource Id for the resource.
     * 
     */
    private final String id;
    /**
     * @return The name of the resource.
     * 
     */
    private final String name;
    /**
     * @return The resource id of the resource the shared private link resource is for
     * 
     */
    private final String privateLinkResourceId;
    /**
     * @return Provisioning state of the shared private link resource
     * 
     */
    private final String provisioningState;
    /**
     * @return The request message for requesting approval of the shared private link resource
     * 
     */
    private final @Nullable String requestMessage;
    /**
     * @return Status of the shared private link resource
     * 
     */
    private final String status;
    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return The type of the resource - e.g. &#34;Microsoft.SignalRService/SignalR&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetWebPubSubSharedPrivateLinkResourceResult(
        @CustomType.Parameter("groupId") String groupId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("privateLinkResourceId") String privateLinkResourceId,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("requestMessage") @Nullable String requestMessage,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.groupId = groupId;
        this.id = id;
        this.name = name;
        this.privateLinkResourceId = privateLinkResourceId;
        this.provisioningState = provisioningState;
        this.requestMessage = requestMessage;
        this.status = status;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * @return The group id from the provider of resource the shared private link resource is for
     * 
     */
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return Fully qualified resource Id for the resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The resource id of the resource the shared private link resource is for
     * 
     */
    public String privateLinkResourceId() {
        return this.privateLinkResourceId;
    }
    /**
     * @return Provisioning state of the shared private link resource
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The request message for requesting approval of the shared private link resource
     * 
     */
    public Optional<String> requestMessage() {
        return Optional.ofNullable(this.requestMessage);
    }
    /**
     * @return Status of the shared private link resource
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return The type of the resource - e.g. &#34;Microsoft.SignalRService/SignalR&#34;
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebPubSubSharedPrivateLinkResourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String groupId;
        private String id;
        private String name;
        private String privateLinkResourceId;
        private String provisioningState;
        private @Nullable String requestMessage;
        private String status;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebPubSubSharedPrivateLinkResourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateLinkResourceId = defaults.privateLinkResourceId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.requestMessage = defaults.requestMessage;
    	      this.status = defaults.status;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder privateLinkResourceId(String privateLinkResourceId) {
            this.privateLinkResourceId = Objects.requireNonNull(privateLinkResourceId);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder requestMessage(@Nullable String requestMessage) {
            this.requestMessage = requestMessage;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetWebPubSubSharedPrivateLinkResourceResult build() {
            return new GetWebPubSubSharedPrivateLinkResourceResult(groupId, id, name, privateLinkResourceId, provisioningState, requestMessage, status, systemData, type);
        }
    }
}
