// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class LocationHDFSNameNodeArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationHDFSNameNodeArgs Empty = new LocationHDFSNameNodeArgs();

    @InputImport(name="hostname", required=true)
    private final Input<String> hostname;

    public Input<String> getHostname() {
        return this.hostname;
    }

    @InputImport(name="port", required=true)
    private final Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port;
    }

    public LocationHDFSNameNodeArgs(
        Input<String> hostname,
        Input<Integer> port) {
        this.hostname = Objects.requireNonNull(hostname, "expected parameter 'hostname' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private LocationHDFSNameNodeArgs() {
        this.hostname = Input.empty();
        this.port = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationHDFSNameNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> hostname;
        private Input<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationHDFSNameNodeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.port = defaults.port;
        }

        public Builder setHostname(Input<String> hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }

        public Builder setHostname(String hostname) {
            this.hostname = Input.of(Objects.requireNonNull(hostname));
            return this;
        }

        public Builder setPort(Input<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Input.of(Objects.requireNonNull(port));
            return this;
        }

        public LocationHDFSNameNodeArgs build() {
            return new LocationHDFSNameNodeArgs(hostname, port);
        }
    }
}
