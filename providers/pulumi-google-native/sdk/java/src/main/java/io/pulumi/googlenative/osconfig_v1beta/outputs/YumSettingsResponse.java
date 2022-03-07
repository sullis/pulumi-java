// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class YumSettingsResponse {
    /**
     * List of packages to exclude from update. These packages are excluded by using the yum `--exclude` flag.
     * 
     */
    private final List<String> excludes;
    /**
     * An exclusive list of packages to be updated. These are the only packages that will be updated. If these packages are not installed, they will be ignored. This field must not be specified with any other patch configuration fields.
     * 
     */
    private final List<String> exclusivePackages;
    /**
     * Will cause patch to run `yum update-minimal` instead.
     * 
     */
    private final Boolean minimal;
    /**
     * Adds the `--security` flag to `yum update`. Not supported on all platforms.
     * 
     */
    private final Boolean security;

    @OutputCustomType.Constructor({"excludes","exclusivePackages","minimal","security"})
    private YumSettingsResponse(
        List<String> excludes,
        List<String> exclusivePackages,
        Boolean minimal,
        Boolean security) {
        this.excludes = Objects.requireNonNull(excludes);
        this.exclusivePackages = Objects.requireNonNull(exclusivePackages);
        this.minimal = Objects.requireNonNull(minimal);
        this.security = Objects.requireNonNull(security);
    }

    /**
     * List of packages to exclude from update. These packages are excluded by using the yum `--exclude` flag.
     * 
    */
    public List<String> getExcludes() {
        return this.excludes;
    }
    /**
     * An exclusive list of packages to be updated. These are the only packages that will be updated. If these packages are not installed, they will be ignored. This field must not be specified with any other patch configuration fields.
     * 
    */
    public List<String> getExclusivePackages() {
        return this.exclusivePackages;
    }
    /**
     * Will cause patch to run `yum update-minimal` instead.
     * 
    */
    public Boolean getMinimal() {
        return this.minimal;
    }
    /**
     * Adds the `--security` flag to `yum update`. Not supported on all platforms.
     * 
    */
    public Boolean getSecurity() {
        return this.security;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(YumSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> excludes;
        private List<String> exclusivePackages;
        private Boolean minimal;
        private Boolean security;

        public Builder() {
    	      // Empty
        }

        public Builder(YumSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludes = defaults.excludes;
    	      this.exclusivePackages = defaults.exclusivePackages;
    	      this.minimal = defaults.minimal;
    	      this.security = defaults.security;
        }

        public Builder setExcludes(List<String> excludes) {
            this.excludes = Objects.requireNonNull(excludes);
            return this;
        }

        public Builder setExclusivePackages(List<String> exclusivePackages) {
            this.exclusivePackages = Objects.requireNonNull(exclusivePackages);
            return this;
        }

        public Builder setMinimal(Boolean minimal) {
            this.minimal = Objects.requireNonNull(minimal);
            return this;
        }

        public Builder setSecurity(Boolean security) {
            this.security = Objects.requireNonNull(security);
            return this;
        }
        public YumSettingsResponse build() {
            return new YumSettingsResponse(excludes, exclusivePackages, minimal, security);
        }
    }
}