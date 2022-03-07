// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GuestPoliciesPackageRepositoryGoo {
    /**
     * Unique identifier for the recipe. Only one recipe with a given name is installed on an instance.
     * Names are also used to identify resources which helps to determine whether guest policies have conflicts.
     * This means that requests to create multiple recipes with the same name and version are rejected since they
     * could potentially have conflicting assignments.
     * 
     */
    private final String name;
    /**
     * The url of the repository.
     * 
     */
    private final String url;

    @OutputCustomType.Constructor({"name","url"})
    private GuestPoliciesPackageRepositoryGoo(
        String name,
        String url) {
        this.name = Objects.requireNonNull(name);
        this.url = Objects.requireNonNull(url);
    }

    /**
     * Unique identifier for the recipe. Only one recipe with a given name is installed on an instance.
     * Names are also used to identify resources which helps to determine whether guest policies have conflicts.
     * This means that requests to create multiple recipes with the same name and version are rejected since they
     * could potentially have conflicting assignments.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The url of the repository.
     * 
    */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesPackageRepositoryGoo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesPackageRepositoryGoo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.url = defaults.url;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public GuestPoliciesPackageRepositoryGoo build() {
            return new GuestPoliciesPackageRepositoryGoo(name, url);
        }
    }
}