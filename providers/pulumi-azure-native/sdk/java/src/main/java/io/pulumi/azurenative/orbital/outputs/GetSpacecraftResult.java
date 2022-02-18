// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital.outputs;

import io.pulumi.azurenative.orbital.outputs.SpacecraftLinkResponse;
import io.pulumi.azurenative.orbital.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSpacecraftResult {
    /**
     * Authorization status of spacecraft.
     * 
     */
    private final String authorizationStatus;
    /**
     * Details of the authorization status.
     * 
     */
    private final String authorizationStatusExtended;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Links of the Spacecraft
     * 
     */
    private final @Nullable List<SpacecraftLinkResponse> links;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * NORAD ID of the spacecraft.
     * 
     */
    private final String noradId;
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Title line of Two Line Element (TLE).
     * 
     */
    private final @Nullable String titleLine;
    /**
     * Line 1 of Two Line Element (TLE).
     * 
     */
    private final @Nullable String tleLine1;
    /**
     * Line 2 of Two Line Element (TLE).
     * 
     */
    private final @Nullable String tleLine2;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"authorizationStatus","authorizationStatusExtended","etag","id","links","location","name","noradId","systemData","tags","titleLine","tleLine1","tleLine2","type"})
    private GetSpacecraftResult(
        String authorizationStatus,
        String authorizationStatusExtended,
        String etag,
        String id,
        @Nullable List<SpacecraftLinkResponse> links,
        String location,
        String name,
        String noradId,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        @Nullable String titleLine,
        @Nullable String tleLine1,
        @Nullable String tleLine2,
        String type) {
        this.authorizationStatus = Objects.requireNonNull(authorizationStatus);
        this.authorizationStatusExtended = Objects.requireNonNull(authorizationStatusExtended);
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.links = links;
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.noradId = Objects.requireNonNull(noradId);
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.titleLine = titleLine;
        this.tleLine1 = tleLine1;
        this.tleLine2 = tleLine2;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Authorization status of spacecraft.
     * 
     */
    public String getAuthorizationStatus() {
        return this.authorizationStatus;
    }
    /**
     * Details of the authorization status.
     * 
     */
    public String getAuthorizationStatusExtended() {
        return this.authorizationStatusExtended;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Links of the Spacecraft
     * 
     */
    public List<SpacecraftLinkResponse> getLinks() {
        return this.links == null ? List.of() : this.links;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * NORAD ID of the spacecraft.
     * 
     */
    public String getNoradId() {
        return this.noradId;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Title line of Two Line Element (TLE).
     * 
     */
    public Optional<String> getTitleLine() {
        return Optional.ofNullable(this.titleLine);
    }
    /**
     * Line 1 of Two Line Element (TLE).
     * 
     */
    public Optional<String> getTleLine1() {
        return Optional.ofNullable(this.tleLine1);
    }
    /**
     * Line 2 of Two Line Element (TLE).
     * 
     */
    public Optional<String> getTleLine2() {
        return Optional.ofNullable(this.tleLine2);
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSpacecraftResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationStatus;
        private String authorizationStatusExtended;
        private String etag;
        private String id;
        private @Nullable List<SpacecraftLinkResponse> links;
        private String location;
        private String name;
        private String noradId;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private @Nullable String titleLine;
        private @Nullable String tleLine1;
        private @Nullable String tleLine2;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSpacecraftResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationStatus = defaults.authorizationStatus;
    	      this.authorizationStatusExtended = defaults.authorizationStatusExtended;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.links = defaults.links;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.noradId = defaults.noradId;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.titleLine = defaults.titleLine;
    	      this.tleLine1 = defaults.tleLine1;
    	      this.tleLine2 = defaults.tleLine2;
    	      this.type = defaults.type;
        }

        public Builder setAuthorizationStatus(String authorizationStatus) {
            this.authorizationStatus = Objects.requireNonNull(authorizationStatus);
            return this;
        }

        public Builder setAuthorizationStatusExtended(String authorizationStatusExtended) {
            this.authorizationStatusExtended = Objects.requireNonNull(authorizationStatusExtended);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLinks(@Nullable List<SpacecraftLinkResponse> links) {
            this.links = links;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNoradId(String noradId) {
            this.noradId = Objects.requireNonNull(noradId);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTitleLine(@Nullable String titleLine) {
            this.titleLine = titleLine;
            return this;
        }

        public Builder setTleLine1(@Nullable String tleLine1) {
            this.tleLine1 = tleLine1;
            return this;
        }

        public Builder setTleLine2(@Nullable String tleLine2) {
            this.tleLine2 = tleLine2;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetSpacecraftResult build() {
            return new GetSpacecraftResult(authorizationStatus, authorizationStatusExtended, etag, id, links, location, name, noradId, systemData, tags, titleLine, tleLine1, tleLine2, type);
        }
    }
}
