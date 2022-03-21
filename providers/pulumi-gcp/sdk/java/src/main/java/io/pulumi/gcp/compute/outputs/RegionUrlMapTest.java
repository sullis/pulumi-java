// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionUrlMapTest {
    /**
     * Description of this test case.
     * 
     */
    private final @Nullable String description;
    /**
     * Host portion of the URL.
     * 
     */
    private final String host;
    /**
     * Path portion of the URL.
     * 
     */
    private final String path;
    /**
     * A reference to expected RegionBackendService resource the given URL should be mapped to.
     * 
     */
    private final String service;

    @CustomType.Constructor
    private RegionUrlMapTest(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("service") String service) {
        this.description = description;
        this.host = host;
        this.path = path;
        this.service = service;
    }

    /**
     * Description of this test case.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Host portion of the URL.
     * 
    */
    public String getHost() {
        return this.host;
    }
    /**
     * Path portion of the URL.
     * 
    */
    public String getPath() {
        return this.path;
    }
    /**
     * A reference to expected RegionBackendService resource the given URL should be mapped to.
     * 
    */
    public String getService() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapTest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String host;
        private String path;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapTest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.host = defaults.host;
    	      this.path = defaults.path;
    	      this.service = defaults.service;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }        public RegionUrlMapTest build() {
            return new RegionUrlMapTest(description, host, path, service);
        }
    }
}
