// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LocationHDFSNameNode {
    /**
     * The DNS name or IP address of the Name Node in the customer's on premises HDFS cluster.
     * 
     */
    private final String hostname;
    /**
     * The port on which the Name Node is listening on for client requests.
     * 
     */
    private final Integer port;

    @OutputCustomType.Constructor
    private LocationHDFSNameNode(
        @OutputCustomType.Parameter("hostname") String hostname,
        @OutputCustomType.Parameter("port") Integer port) {
        this.hostname = hostname;
        this.port = port;
    }

    /**
     * The DNS name or IP address of the Name Node in the customer's on premises HDFS cluster.
     * 
    */
    public String getHostname() {
        return this.hostname;
    }
    /**
     * The port on which the Name Node is listening on for client requests.
     * 
    */
    public Integer getPort() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationHDFSNameNode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostname;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationHDFSNameNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.port = defaults.port;
        }

        public Builder setHostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public LocationHDFSNameNode build() {
            return new LocationHDFSNameNode(hostname, port);
        }
    }
}
