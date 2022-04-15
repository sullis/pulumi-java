// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.aws.imagebuilder.outputs.GetImageRecipeBlockDeviceMapping;
import io.pulumi.aws.imagebuilder.outputs.GetImageRecipeComponent;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetImageRecipeResult {
    private final String arn;
    /**
     * Set of objects with block device mappings for the the image recipe.
     * 
     */
    private final List<GetImageRecipeBlockDeviceMapping> blockDeviceMappings;
    /**
     * List of objects with components for the image recipe.
     * 
     */
    private final List<GetImageRecipeComponent> components;
    /**
     * Date the image recipe was created.
     * 
     */
    private final String dateCreated;
    /**
     * Description of the image recipe.
     * 
     */
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Name of the image recipe.
     * 
     */
    private final String name;
    /**
     * Owner of the image recipe.
     * 
     */
    private final String owner;
    /**
     * Platform of the image recipe.
     * 
     */
    private final String parentImage;
    /**
     * Platform of the image recipe.
     * 
     */
    private final String platform;
    /**
     * Key-value map of resource tags for the image recipe.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Base64 encoded contents of user data. Commands or a command script to run when build instance is launched.
     * 
     */
    private final String userDataBase64;
    /**
     * Version of the image recipe.
     * 
     */
    private final String version;
    /**
     * The working directory used during build and test workflows.
     * 
     */
    private final String workingDirectory;

    @CustomType.Constructor
    private GetImageRecipeResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("blockDeviceMappings") List<GetImageRecipeBlockDeviceMapping> blockDeviceMappings,
        @CustomType.Parameter("components") List<GetImageRecipeComponent> components,
        @CustomType.Parameter("dateCreated") String dateCreated,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("owner") String owner,
        @CustomType.Parameter("parentImage") String parentImage,
        @CustomType.Parameter("platform") String platform,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("userDataBase64") String userDataBase64,
        @CustomType.Parameter("version") String version,
        @CustomType.Parameter("workingDirectory") String workingDirectory) {
        this.arn = arn;
        this.blockDeviceMappings = blockDeviceMappings;
        this.components = components;
        this.dateCreated = dateCreated;
        this.description = description;
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.parentImage = parentImage;
        this.platform = platform;
        this.tags = tags;
        this.userDataBase64 = userDataBase64;
        this.version = version;
        this.workingDirectory = workingDirectory;
    }

    public String arn() {
        return this.arn;
    }
    /**
     * Set of objects with block device mappings for the the image recipe.
     * 
    */
    public List<GetImageRecipeBlockDeviceMapping> blockDeviceMappings() {
        return this.blockDeviceMappings;
    }
    /**
     * List of objects with components for the image recipe.
     * 
    */
    public List<GetImageRecipeComponent> components() {
        return this.components;
    }
    /**
     * Date the image recipe was created.
     * 
    */
    public String dateCreated() {
        return this.dateCreated;
    }
    /**
     * Description of the image recipe.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Name of the image recipe.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Owner of the image recipe.
     * 
    */
    public String owner() {
        return this.owner;
    }
    /**
     * Platform of the image recipe.
     * 
    */
    public String parentImage() {
        return this.parentImage;
    }
    /**
     * Platform of the image recipe.
     * 
    */
    public String platform() {
        return this.platform;
    }
    /**
     * Key-value map of resource tags for the image recipe.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Base64 encoded contents of user data. Commands or a command script to run when build instance is launched.
     * 
    */
    public String userDataBase64() {
        return this.userDataBase64;
    }
    /**
     * Version of the image recipe.
     * 
    */
    public String version() {
        return this.version;
    }
    /**
     * The working directory used during build and test workflows.
     * 
    */
    public String workingDirectory() {
        return this.workingDirectory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageRecipeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private List<GetImageRecipeBlockDeviceMapping> blockDeviceMappings;
        private List<GetImageRecipeComponent> components;
        private String dateCreated;
        private String description;
        private String id;
        private String name;
        private String owner;
        private String parentImage;
        private String platform;
        private @Nullable Map<String,String> tags;
        private String userDataBase64;
        private String version;
        private String workingDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageRecipeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.blockDeviceMappings = defaults.blockDeviceMappings;
    	      this.components = defaults.components;
    	      this.dateCreated = defaults.dateCreated;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.parentImage = defaults.parentImage;
    	      this.platform = defaults.platform;
    	      this.tags = defaults.tags;
    	      this.userDataBase64 = defaults.userDataBase64;
    	      this.version = defaults.version;
    	      this.workingDirectory = defaults.workingDirectory;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder blockDeviceMappings(List<GetImageRecipeBlockDeviceMapping> blockDeviceMappings) {
            this.blockDeviceMappings = Objects.requireNonNull(blockDeviceMappings);
            return this;
        }
        public Builder blockDeviceMappings(GetImageRecipeBlockDeviceMapping... blockDeviceMappings) {
            return blockDeviceMappings(List.of(blockDeviceMappings));
        }
        public Builder components(List<GetImageRecipeComponent> components) {
            this.components = Objects.requireNonNull(components);
            return this;
        }
        public Builder components(GetImageRecipeComponent... components) {
            return components(List.of(components));
        }
        public Builder dateCreated(String dateCreated) {
            this.dateCreated = Objects.requireNonNull(dateCreated);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
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
        public Builder owner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        public Builder parentImage(String parentImage) {
            this.parentImage = Objects.requireNonNull(parentImage);
            return this;
        }
        public Builder platform(String platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder userDataBase64(String userDataBase64) {
            this.userDataBase64 = Objects.requireNonNull(userDataBase64);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder workingDirectory(String workingDirectory) {
            this.workingDirectory = Objects.requireNonNull(workingDirectory);
            return this;
        }        public GetImageRecipeResult build() {
            return new GetImageRecipeResult(arn, blockDeviceMappings, components, dateCreated, description, id, name, owner, parentImage, platform, tags, userDataBase64, version, workingDirectory);
        }
    }
}
