// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatacatalogV1PersonalDetailsResponse {
    /**
     * Set if the entry is starred; unset otherwise.
     * 
     */
    private final String starTime;
    /**
     * True if the entry is starred by the user; false otherwise.
     * 
     */
    private final Boolean starred;

    @OutputCustomType.Constructor({"starTime","starred"})
    private GoogleCloudDatacatalogV1PersonalDetailsResponse(
        String starTime,
        Boolean starred) {
        this.starTime = Objects.requireNonNull(starTime);
        this.starred = Objects.requireNonNull(starred);
    }

    /**
     * Set if the entry is starred; unset otherwise.
     * 
    */
    public String getStarTime() {
        return this.starTime;
    }
    /**
     * True if the entry is starred by the user; false otherwise.
     * 
    */
    public Boolean getStarred() {
        return this.starred;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1PersonalDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String starTime;
        private Boolean starred;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1PersonalDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.starTime = defaults.starTime;
    	      this.starred = defaults.starred;
        }

        public Builder setStarTime(String starTime) {
            this.starTime = Objects.requireNonNull(starTime);
            return this;
        }

        public Builder setStarred(Boolean starred) {
            this.starred = Objects.requireNonNull(starred);
            return this;
        }
        public GoogleCloudDatacatalogV1PersonalDetailsResponse build() {
            return new GoogleCloudDatacatalogV1PersonalDetailsResponse(starTime, starred);
        }
    }
}