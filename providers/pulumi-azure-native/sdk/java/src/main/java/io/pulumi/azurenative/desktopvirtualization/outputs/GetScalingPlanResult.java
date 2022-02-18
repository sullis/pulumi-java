// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.outputs;

import io.pulumi.azurenative.desktopvirtualization.outputs.ResourceModelWithAllowedPropertySetResponseIdentity;
import io.pulumi.azurenative.desktopvirtualization.outputs.ResourceModelWithAllowedPropertySetResponsePlan;
import io.pulumi.azurenative.desktopvirtualization.outputs.ResourceModelWithAllowedPropertySetResponseSku;
import io.pulumi.azurenative.desktopvirtualization.outputs.ScalingHostPoolReferenceResponse;
import io.pulumi.azurenative.desktopvirtualization.outputs.ScalingScheduleResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetScalingPlanResult {
    /**
     * Description of scaling plan.
     * 
     */
    private final @Nullable String description;
    /**
     * The etag field is *not* required. If it is provided in the response body, it must also be provided as a header per the normal etag convention.  Entity tags are used for comparing two or more entities from the same requested resource. HTTP/1.1 uses entity tags in the etag (section 14.19), If-Match (section 14.24), If-None-Match (section 14.26), and If-Range (section 14.27) header fields.
     * 
     */
    private final String etag;
    /**
     * Exclusion tag for scaling plan.
     * 
     */
    private final @Nullable String exclusionTag;
    /**
     * User friendly name of scaling plan.
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * List of ScalingHostPoolReference definitions.
     * 
     */
    private final @Nullable List<ScalingHostPoolReferenceResponse> hostPoolReferences;
    /**
     * HostPool type for desktop.
     * 
     */
    private final @Nullable String hostPoolType;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    private final @Nullable ResourceModelWithAllowedPropertySetResponseIdentity identity;
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    private final @Nullable String kind;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final @Nullable String location;
    /**
     * The fully qualified resource ID of the resource that manages this resource. Indicates if this resource is managed by another Azure resource. If this is present, complete mode deployment will not delete the resource if it is removed from the template since it is managed by another resource.
     * 
     */
    private final @Nullable String managedBy;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * ObjectId of scaling plan. (internal use)
     * 
     */
    private final String objectId;
    private final @Nullable ResourceModelWithAllowedPropertySetResponsePlan plan;
    /**
     * The ring number of scaling plan.
     * 
     */
    private final @Nullable Integer ring;
    /**
     * List of ScalingSchedule definitions.
     * 
     */
    private final @Nullable List<ScalingScheduleResponse> schedules;
    private final @Nullable ResourceModelWithAllowedPropertySetResponseSku sku;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Timezone of the scaling plan.
     * 
     */
    private final @Nullable String timeZone;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"description","etag","exclusionTag","friendlyName","hostPoolReferences","hostPoolType","id","identity","kind","location","managedBy","name","objectId","plan","ring","schedules","sku","tags","timeZone","type"})
    private GetScalingPlanResult(
        @Nullable String description,
        String etag,
        @Nullable String exclusionTag,
        @Nullable String friendlyName,
        @Nullable List<ScalingHostPoolReferenceResponse> hostPoolReferences,
        @Nullable String hostPoolType,
        String id,
        @Nullable ResourceModelWithAllowedPropertySetResponseIdentity identity,
        @Nullable String kind,
        @Nullable String location,
        @Nullable String managedBy,
        String name,
        String objectId,
        @Nullable ResourceModelWithAllowedPropertySetResponsePlan plan,
        @Nullable Integer ring,
        @Nullable List<ScalingScheduleResponse> schedules,
        @Nullable ResourceModelWithAllowedPropertySetResponseSku sku,
        @Nullable Map<String,String> tags,
        @Nullable String timeZone,
        String type) {
        this.description = description;
        this.etag = Objects.requireNonNull(etag);
        this.exclusionTag = exclusionTag;
        this.friendlyName = friendlyName;
        this.hostPoolReferences = hostPoolReferences;
        this.hostPoolType = hostPoolType;
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.kind = kind;
        this.location = location;
        this.managedBy = managedBy;
        this.name = Objects.requireNonNull(name);
        this.objectId = Objects.requireNonNull(objectId);
        this.plan = plan;
        this.ring = ring;
        this.schedules = schedules;
        this.sku = sku;
        this.tags = tags;
        this.timeZone = timeZone;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Description of scaling plan.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The etag field is *not* required. If it is provided in the response body, it must also be provided as a header per the normal etag convention.  Entity tags are used for comparing two or more entities from the same requested resource. HTTP/1.1 uses entity tags in the etag (section 14.19), If-Match (section 14.24), If-None-Match (section 14.26), and If-Range (section 14.27) header fields.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Exclusion tag for scaling plan.
     * 
     */
    public Optional<String> getExclusionTag() {
        return Optional.ofNullable(this.exclusionTag);
    }
    /**
     * User friendly name of scaling plan.
     * 
     */
    public Optional<String> getFriendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * List of ScalingHostPoolReference definitions.
     * 
     */
    public List<ScalingHostPoolReferenceResponse> getHostPoolReferences() {
        return this.hostPoolReferences == null ? List.of() : this.hostPoolReferences;
    }
    /**
     * HostPool type for desktop.
     * 
     */
    public Optional<String> getHostPoolType() {
        return Optional.ofNullable(this.hostPoolType);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    public Optional<ResourceModelWithAllowedPropertySetResponseIdentity> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The fully qualified resource ID of the resource that manages this resource. Indicates if this resource is managed by another Azure resource. If this is present, complete mode deployment will not delete the resource if it is removed from the template since it is managed by another resource.
     * 
     */
    public Optional<String> getManagedBy() {
        return Optional.ofNullable(this.managedBy);
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * ObjectId of scaling plan. (internal use)
     * 
     */
    public String getObjectId() {
        return this.objectId;
    }
    public Optional<ResourceModelWithAllowedPropertySetResponsePlan> getPlan() {
        return Optional.ofNullable(this.plan);
    }
    /**
     * The ring number of scaling plan.
     * 
     */
    public Optional<Integer> getRing() {
        return Optional.ofNullable(this.ring);
    }
    /**
     * List of ScalingSchedule definitions.
     * 
     */
    public List<ScalingScheduleResponse> getSchedules() {
        return this.schedules == null ? List.of() : this.schedules;
    }
    public Optional<ResourceModelWithAllowedPropertySetResponseSku> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Timezone of the scaling plan.
     * 
     */
    public Optional<String> getTimeZone() {
        return Optional.ofNullable(this.timeZone);
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

    public static Builder builder(GetScalingPlanResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String etag;
        private @Nullable String exclusionTag;
        private @Nullable String friendlyName;
        private @Nullable List<ScalingHostPoolReferenceResponse> hostPoolReferences;
        private @Nullable String hostPoolType;
        private String id;
        private @Nullable ResourceModelWithAllowedPropertySetResponseIdentity identity;
        private @Nullable String kind;
        private @Nullable String location;
        private @Nullable String managedBy;
        private String name;
        private String objectId;
        private @Nullable ResourceModelWithAllowedPropertySetResponsePlan plan;
        private @Nullable Integer ring;
        private @Nullable List<ScalingScheduleResponse> schedules;
        private @Nullable ResourceModelWithAllowedPropertySetResponseSku sku;
        private @Nullable Map<String,String> tags;
        private @Nullable String timeZone;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScalingPlanResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.exclusionTag = defaults.exclusionTag;
    	      this.friendlyName = defaults.friendlyName;
    	      this.hostPoolReferences = defaults.hostPoolReferences;
    	      this.hostPoolType = defaults.hostPoolType;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.managedBy = defaults.managedBy;
    	      this.name = defaults.name;
    	      this.objectId = defaults.objectId;
    	      this.plan = defaults.plan;
    	      this.ring = defaults.ring;
    	      this.schedules = defaults.schedules;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.timeZone = defaults.timeZone;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setExclusionTag(@Nullable String exclusionTag) {
            this.exclusionTag = exclusionTag;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setHostPoolReferences(@Nullable List<ScalingHostPoolReferenceResponse> hostPoolReferences) {
            this.hostPoolReferences = hostPoolReferences;
            return this;
        }

        public Builder setHostPoolType(@Nullable String hostPoolType) {
            this.hostPoolType = hostPoolType;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable ResourceModelWithAllowedPropertySetResponseIdentity identity) {
            this.identity = identity;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setManagedBy(@Nullable String managedBy) {
            this.managedBy = managedBy;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setObjectId(String objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }

        public Builder setPlan(@Nullable ResourceModelWithAllowedPropertySetResponsePlan plan) {
            this.plan = plan;
            return this;
        }

        public Builder setRing(@Nullable Integer ring) {
            this.ring = ring;
            return this;
        }

        public Builder setSchedules(@Nullable List<ScalingScheduleResponse> schedules) {
            this.schedules = schedules;
            return this;
        }

        public Builder setSku(@Nullable ResourceModelWithAllowedPropertySetResponseSku sku) {
            this.sku = sku;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetScalingPlanResult build() {
            return new GetScalingPlanResult(description, etag, exclusionTag, friendlyName, hostPoolReferences, hostPoolType, id, identity, kind, location, managedBy, name, objectId, plan, ring, schedules, sku, tags, timeZone, type);
        }
    }
}
