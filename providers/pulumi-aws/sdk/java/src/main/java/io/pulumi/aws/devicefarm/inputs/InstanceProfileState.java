// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.devicefarm.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceProfileState extends io.pulumi.resources.ResourceArgs {

    public static final InstanceProfileState Empty = new InstanceProfileState();

    /**
     * The Amazon Resource Name of this instance profile.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The description of the instance profile.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run.
     * 
     */
    @Import(name="excludeAppPackagesFromCleanups")
      private final @Nullable Output<List<String>> excludeAppPackagesFromCleanups;

    public Output<List<String>> getExcludeAppPackagesFromCleanups() {
        return this.excludeAppPackagesFromCleanups == null ? Output.empty() : this.excludeAppPackagesFromCleanups;
    }

    /**
     * The name for the instance profile.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * When set to `true`, Device Farm removes app packages after a test run. The default value is `false` for private devices.
     * 
     */
    @Import(name="packageCleanup")
      private final @Nullable Output<Boolean> packageCleanup;

    public Output<Boolean> getPackageCleanup() {
        return this.packageCleanup == null ? Output.empty() : this.packageCleanup;
    }

    /**
     * When set to `true`, Device Farm reboots the instance after a test run. The default value is `true`.
     * 
     */
    @Import(name="rebootAfterUse")
      private final @Nullable Output<Boolean> rebootAfterUse;

    public Output<Boolean> getRebootAfterUse() {
        return this.rebootAfterUse == null ? Output.empty() : this.rebootAfterUse;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public InstanceProfileState(
        @Nullable Output<String> arn,
        @Nullable Output<String> description,
        @Nullable Output<List<String>> excludeAppPackagesFromCleanups,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> packageCleanup,
        @Nullable Output<Boolean> rebootAfterUse,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.description = description;
        this.excludeAppPackagesFromCleanups = excludeAppPackagesFromCleanups;
        this.name = name;
        this.packageCleanup = packageCleanup;
        this.rebootAfterUse = rebootAfterUse;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private InstanceProfileState() {
        this.arn = Output.empty();
        this.description = Output.empty();
        this.excludeAppPackagesFromCleanups = Output.empty();
        this.name = Output.empty();
        this.packageCleanup = Output.empty();
        this.rebootAfterUse = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> excludeAppPackagesFromCleanups;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> packageCleanup;
        private @Nullable Output<Boolean> rebootAfterUse;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceProfileState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.excludeAppPackagesFromCleanups = defaults.excludeAppPackagesFromCleanups;
    	      this.name = defaults.name;
    	      this.packageCleanup = defaults.packageCleanup;
    	      this.rebootAfterUse = defaults.rebootAfterUse;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder excludeAppPackagesFromCleanups(@Nullable Output<List<String>> excludeAppPackagesFromCleanups) {
            this.excludeAppPackagesFromCleanups = excludeAppPackagesFromCleanups;
            return this;
        }
        public Builder excludeAppPackagesFromCleanups(@Nullable List<String> excludeAppPackagesFromCleanups) {
            this.excludeAppPackagesFromCleanups = Output.ofNullable(excludeAppPackagesFromCleanups);
            return this;
        }
        public Builder excludeAppPackagesFromCleanups(String... excludeAppPackagesFromCleanups) {
            return excludeAppPackagesFromCleanups(List.of(excludeAppPackagesFromCleanups));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder packageCleanup(@Nullable Output<Boolean> packageCleanup) {
            this.packageCleanup = packageCleanup;
            return this;
        }
        public Builder packageCleanup(@Nullable Boolean packageCleanup) {
            this.packageCleanup = Output.ofNullable(packageCleanup);
            return this;
        }
        public Builder rebootAfterUse(@Nullable Output<Boolean> rebootAfterUse) {
            this.rebootAfterUse = rebootAfterUse;
            return this;
        }
        public Builder rebootAfterUse(@Nullable Boolean rebootAfterUse) {
            this.rebootAfterUse = Output.ofNullable(rebootAfterUse);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }        public InstanceProfileState build() {
            return new InstanceProfileState(arn, description, excludeAppPackagesFromCleanups, name, packageCleanup, rebootAfterUse, tags, tagsAll);
        }
    }
}
