// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LibraryResponse {
    /**
     * Name of the library. Example: "django".
     * 
     */
    private final String name;
    /**
     * Version of the library to select, or "latest".
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"name","version"})
    private LibraryResponse(
        String name,
        String version) {
        this.name = Objects.requireNonNull(name);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * Name of the library. Example: "django".
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Version of the library to select, or "latest".
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LibraryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(LibraryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public LibraryResponse build() {
            return new LibraryResponse(name, version);
        }
    }
}