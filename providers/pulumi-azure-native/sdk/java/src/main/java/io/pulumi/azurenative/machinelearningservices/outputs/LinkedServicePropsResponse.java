// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LinkedServicePropsResponse {
    /**
     * The creation time of the linked service.
     * 
     */
    private final @Nullable String createdTime;
    /**
     * Type of the link target.
     * 
     */
    private final @Nullable String linkType;
    /**
     * ResourceId of the link target of the linked service.
     * 
     */
    private final String linkedServiceResourceId;
    /**
     * The last modified time of the linked service.
     * 
     */
    private final @Nullable String modifiedTime;

    @OutputCustomType.Constructor({"createdTime","linkType","linkedServiceResourceId","modifiedTime"})
    private LinkedServicePropsResponse(
        @Nullable String createdTime,
        @Nullable String linkType,
        String linkedServiceResourceId,
        @Nullable String modifiedTime) {
        this.createdTime = createdTime;
        this.linkType = linkType;
        this.linkedServiceResourceId = Objects.requireNonNull(linkedServiceResourceId);
        this.modifiedTime = modifiedTime;
    }

    /**
     * The creation time of the linked service.
     * 
     */
    public Optional<String> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    /**
     * Type of the link target.
     * 
     */
    public Optional<String> getLinkType() {
        return Optional.ofNullable(this.linkType);
    }
    /**
     * ResourceId of the link target of the linked service.
     * 
     */
    public String getLinkedServiceResourceId() {
        return this.linkedServiceResourceId;
    }
    /**
     * The last modified time of the linked service.
     * 
     */
    public Optional<String> getModifiedTime() {
        return Optional.ofNullable(this.modifiedTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedServicePropsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createdTime;
        private @Nullable String linkType;
        private String linkedServiceResourceId;
        private @Nullable String modifiedTime;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedServicePropsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdTime = defaults.createdTime;
    	      this.linkType = defaults.linkType;
    	      this.linkedServiceResourceId = defaults.linkedServiceResourceId;
    	      this.modifiedTime = defaults.modifiedTime;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setLinkType(@Nullable String linkType) {
            this.linkType = linkType;
            return this;
        }

        public Builder setLinkedServiceResourceId(String linkedServiceResourceId) {
            this.linkedServiceResourceId = Objects.requireNonNull(linkedServiceResourceId);
            return this;
        }

        public Builder setModifiedTime(@Nullable String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        public LinkedServicePropsResponse build() {
            return new LinkedServicePropsResponse(createdTime, linkType, linkedServiceResourceId, modifiedTime);
        }
    }
}
