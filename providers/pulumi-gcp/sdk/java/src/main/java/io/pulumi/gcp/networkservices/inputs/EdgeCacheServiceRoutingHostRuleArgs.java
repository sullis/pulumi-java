// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingHostRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingHostRuleArgs Empty = new EdgeCacheServiceRoutingHostRuleArgs();

    /**
     * A human-readable description of the resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The list of host patterns to match.
     * Host patterns must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*).
     * The only accepted ports are :80 and :443.
     * Hosts are matched against the HTTP Host header, or for HTTP/2 and HTTP/3, the ":authority" header, from the incoming request.
     * 
     */
    @InputImport(name="hosts", required=true)
    private final Input<List<String>> hosts;

    public Input<List<String>> getHosts() {
        return this.hosts;
    }

    /**
     * The name of the pathMatcher associated with this hostRule.
     * 
     */
    @InputImport(name="pathMatcher", required=true)
    private final Input<String> pathMatcher;

    public Input<String> getPathMatcher() {
        return this.pathMatcher;
    }

    public EdgeCacheServiceRoutingHostRuleArgs(
        @Nullable Input<String> description,
        Input<List<String>> hosts,
        Input<String> pathMatcher) {
        this.description = description;
        this.hosts = Objects.requireNonNull(hosts, "expected parameter 'hosts' to be non-null");
        this.pathMatcher = Objects.requireNonNull(pathMatcher, "expected parameter 'pathMatcher' to be non-null");
    }

    private EdgeCacheServiceRoutingHostRuleArgs() {
        this.description = Input.empty();
        this.hosts = Input.empty();
        this.pathMatcher = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingHostRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<List<String>> hosts;
        private Input<String> pathMatcher;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingHostRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.hosts = defaults.hosts;
    	      this.pathMatcher = defaults.pathMatcher;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setHosts(Input<List<String>> hosts) {
            this.hosts = Objects.requireNonNull(hosts);
            return this;
        }

        public Builder setHosts(List<String> hosts) {
            this.hosts = Input.of(Objects.requireNonNull(hosts));
            return this;
        }

        public Builder setPathMatcher(Input<String> pathMatcher) {
            this.pathMatcher = Objects.requireNonNull(pathMatcher);
            return this;
        }

        public Builder setPathMatcher(String pathMatcher) {
            this.pathMatcher = Input.of(Objects.requireNonNull(pathMatcher));
            return this;
        }

        public EdgeCacheServiceRoutingHostRuleArgs build() {
            return new EdgeCacheServiceRoutingHostRuleArgs(description, hosts, pathMatcher);
        }
    }
}
