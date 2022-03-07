// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetImageResult {
    /**
     * The description of the image.
     * 
     */
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String imageId;
    /**
     * The name of the image.
     * 
     */
    private final String name;
    private final String operatingSystemType;
    /**
     * Specifies whether the image is running on dedicated hardware. When Bring Your Own License (BYOL) is enabled, this value is set to DEDICATED. For more information, see [Bring Your Own Windows Desktop Images](https://docs.aws.amazon.com/workspaces/latest/adminguide/byol-windows-images.html).
     * 
     */
    private final String requiredTenancy;
    /**
     * The status of the image.
     * 
     */
    private final String state;

    @OutputCustomType.Constructor({"description","id","imageId","name","operatingSystemType","requiredTenancy","state"})
    private GetImageResult(
        String description,
        String id,
        String imageId,
        String name,
        String operatingSystemType,
        String requiredTenancy,
        String state) {
        this.description = Objects.requireNonNull(description);
        this.id = Objects.requireNonNull(id);
        this.imageId = Objects.requireNonNull(imageId);
        this.name = Objects.requireNonNull(name);
        this.operatingSystemType = Objects.requireNonNull(operatingSystemType);
        this.requiredTenancy = Objects.requireNonNull(requiredTenancy);
        this.state = Objects.requireNonNull(state);
    }

    /**
     * The description of the image.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getImageId() {
        return this.imageId;
    }
    /**
     * The name of the image.
     * 
    */
    public String getName() {
        return this.name;
    }
    public String getOperatingSystemType() {
        return this.operatingSystemType;
    }
    /**
     * Specifies whether the image is running on dedicated hardware. When Bring Your Own License (BYOL) is enabled, this value is set to DEDICATED. For more information, see [Bring Your Own Windows Desktop Images](https://docs.aws.amazon.com/workspaces/latest/adminguide/byol-windows-images.html).
     * 
    */
    public String getRequiredTenancy() {
        return this.requiredTenancy;
    }
    /**
     * The status of the image.
     * 
    */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String id;
        private String imageId;
        private String name;
        private String operatingSystemType;
        private String requiredTenancy;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.imageId = defaults.imageId;
    	      this.name = defaults.name;
    	      this.operatingSystemType = defaults.operatingSystemType;
    	      this.requiredTenancy = defaults.requiredTenancy;
    	      this.state = defaults.state;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setImageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOperatingSystemType(String operatingSystemType) {
            this.operatingSystemType = Objects.requireNonNull(operatingSystemType);
            return this;
        }

        public Builder setRequiredTenancy(String requiredTenancy) {
            this.requiredTenancy = Objects.requireNonNull(requiredTenancy);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetImageResult build() {
            return new GetImageResult(description, id, imageId, name, operatingSystemType, requiredTenancy, state);
        }
    }
}