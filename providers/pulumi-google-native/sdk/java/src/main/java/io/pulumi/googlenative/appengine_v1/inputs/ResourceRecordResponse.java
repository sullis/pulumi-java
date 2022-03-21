// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A DNS resource record.
 * 
 */
public final class ResourceRecordResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceRecordResponse Empty = new ResourceRecordResponse();

    /**
     * Relative name of the object affected by this record. Only applicable for CNAME records. Example: 'www'.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Data for this record. Values vary by record type, as defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1).
     * 
     */
    @Import(name="rrdata", required=true)
      private final String rrdata;

    public String getRrdata() {
        return this.rrdata;
    }

    /**
     * Resource record type. Example: AAAA.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public ResourceRecordResponse(
        String name,
        String rrdata,
        String type) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.rrdata = Objects.requireNonNull(rrdata, "expected parameter 'rrdata' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ResourceRecordResponse() {
        this.name = null;
        this.rrdata = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String rrdata;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.rrdata = defaults.rrdata;
    	      this.type = defaults.type;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder rrdata(String rrdata) {
            this.rrdata = Objects.requireNonNull(rrdata);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ResourceRecordResponse build() {
            return new ResourceRecordResponse(name, rrdata, type);
        }
    }
}
