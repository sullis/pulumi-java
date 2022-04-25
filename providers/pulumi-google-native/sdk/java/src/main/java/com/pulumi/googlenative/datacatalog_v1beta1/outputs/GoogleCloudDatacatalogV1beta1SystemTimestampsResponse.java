// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatacatalogV1beta1SystemTimestampsResponse {
    /**
     * @return The creation time of the resource within the given system.
     * 
     */
    private final String createTime;
    /**
     * @return The expiration time of the resource within the given system. Currently only apllicable to BigQuery resources.
     * 
     */
    private final String expireTime;
    /**
     * @return The last-modified time of the resource within the given system.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GoogleCloudDatacatalogV1beta1SystemTimestampsResponse(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("expireTime") String expireTime,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.expireTime = expireTime;
        this.updateTime = updateTime;
    }

    /**
     * @return The creation time of the resource within the given system.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The expiration time of the resource within the given system. Currently only apllicable to BigQuery resources.
     * 
     */
    public String expireTime() {
        return this.expireTime;
    }
    /**
     * @return The last-modified time of the resource within the given system.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1beta1SystemTimestampsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String expireTime;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1beta1SystemTimestampsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.expireTime = defaults.expireTime;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GoogleCloudDatacatalogV1beta1SystemTimestampsResponse build() {
            return new GoogleCloudDatacatalogV1beta1SystemTimestampsResponse(createTime, expireTime, updateTime);
        }
    }
}
