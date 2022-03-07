// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managementpartner.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPartnerResult {
    /**
     * This is the DateTime when the partner was created.
     * 
     */
    private final @Nullable String createdTime;
    /**
     * Type of the partner
     * 
     */
    private final @Nullable Integer etag;
    /**
     * Identifier of the partner
     * 
     */
    private final String id;
    /**
     * Name of the partner
     * 
     */
    private final String name;
    /**
     * This is the object id.
     * 
     */
    private final @Nullable String objectId;
    /**
     * This is the partner id
     * 
     */
    private final @Nullable String partnerId;
    /**
     * This is the partner name
     * 
     */
    private final @Nullable String partnerName;
    /**
     * This is the tenant id.
     * 
     */
    private final @Nullable String tenantId;
    /**
     * Type of resource. "Microsoft.ManagementPartner/partners"
     * 
     */
    private final String type;
    /**
     * This is the DateTime when the partner was updated.
     * 
     */
    private final @Nullable String updatedTime;
    /**
     * This is the version.
     * 
     */
    private final @Nullable Integer version;

    @OutputCustomType.Constructor({"createdTime","etag","id","name","objectId","partnerId","partnerName","tenantId","type","updatedTime","version"})
    private GetPartnerResult(
        @Nullable String createdTime,
        @Nullable Integer etag,
        String id,
        String name,
        @Nullable String objectId,
        @Nullable String partnerId,
        @Nullable String partnerName,
        @Nullable String tenantId,
        String type,
        @Nullable String updatedTime,
        @Nullable Integer version) {
        this.createdTime = createdTime;
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.objectId = objectId;
        this.partnerId = partnerId;
        this.partnerName = partnerName;
        this.tenantId = tenantId;
        this.type = Objects.requireNonNull(type);
        this.updatedTime = updatedTime;
        this.version = version;
    }

    /**
     * This is the DateTime when the partner was created.
     * 
    */
    public Optional<String> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    /**
     * Type of the partner
     * 
    */
    public Optional<Integer> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Identifier of the partner
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Name of the partner
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * This is the object id.
     * 
    */
    public Optional<String> getObjectId() {
        return Optional.ofNullable(this.objectId);
    }
    /**
     * This is the partner id
     * 
    */
    public Optional<String> getPartnerId() {
        return Optional.ofNullable(this.partnerId);
    }
    /**
     * This is the partner name
     * 
    */
    public Optional<String> getPartnerName() {
        return Optional.ofNullable(this.partnerName);
    }
    /**
     * This is the tenant id.
     * 
    */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * Type of resource. "Microsoft.ManagementPartner/partners"
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * This is the DateTime when the partner was updated.
     * 
    */
    public Optional<String> getUpdatedTime() {
        return Optional.ofNullable(this.updatedTime);
    }
    /**
     * This is the version.
     * 
    */
    public Optional<Integer> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPartnerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createdTime;
        private @Nullable Integer etag;
        private String id;
        private String name;
        private @Nullable String objectId;
        private @Nullable String partnerId;
        private @Nullable String partnerName;
        private @Nullable String tenantId;
        private String type;
        private @Nullable String updatedTime;
        private @Nullable Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPartnerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdTime = defaults.createdTime;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.objectId = defaults.objectId;
    	      this.partnerId = defaults.partnerId;
    	      this.partnerName = defaults.partnerName;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.updatedTime = defaults.updatedTime;
    	      this.version = defaults.version;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setEtag(@Nullable Integer etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setObjectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }

        public Builder setPartnerId(@Nullable String partnerId) {
            this.partnerId = partnerId;
            return this;
        }

        public Builder setPartnerName(@Nullable String partnerName) {
            this.partnerName = partnerName;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUpdatedTime(@Nullable String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }

        public Builder setVersion(@Nullable Integer version) {
            this.version = version;
            return this;
        }
        public GetPartnerResult build() {
            return new GetPartnerResult(createdTime, etag, id, name, objectId, partnerId, partnerName, tenantId, type, updatedTime, version);
        }
    }
}