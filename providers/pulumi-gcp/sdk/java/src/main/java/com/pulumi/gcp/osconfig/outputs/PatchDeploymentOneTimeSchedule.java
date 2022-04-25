// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PatchDeploymentOneTimeSchedule {
    /**
     * @return The desired patch job execution time. A timestamp in RFC3339 UTC &#34;Zulu&#34; format,
     * accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    private final String executeTime;

    @CustomType.Constructor
    private PatchDeploymentOneTimeSchedule(@CustomType.Parameter("executeTime") String executeTime) {
        this.executeTime = executeTime;
    }

    /**
     * @return The desired patch job execution time. A timestamp in RFC3339 UTC &#34;Zulu&#34; format,
     * accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public String executeTime() {
        return this.executeTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentOneTimeSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String executeTime;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentOneTimeSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executeTime = defaults.executeTime;
        }

        public Builder executeTime(String executeTime) {
            this.executeTime = Objects.requireNonNull(executeTime);
            return this;
        }        public PatchDeploymentOneTimeSchedule build() {
            return new PatchDeploymentOneTimeSchedule(executeTime);
        }
    }
}
