// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TimeZoneResponse {
    /**
     * Optional. IANA Time Zone Database version number, e.g. "2019a".
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"version"})
    private TimeZoneResponse(String version) {
        this.version = Objects.requireNonNull(version);
    }

    /**
     * Optional. IANA Time Zone Database version number, e.g. "2019a".
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeZoneResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeZoneResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.version = defaults.version;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public TimeZoneResponse build() {
            return new TimeZoneResponse(version);
        }
    }
}