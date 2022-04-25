// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs_v4.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ProcessingOptionsResponse {
    /**
     * @return If set to `true`, the service does not attempt to resolve a more precise address for the job.
     * 
     */
    private final Boolean disableStreetAddressResolution;
    /**
     * @return Option for job HTML content sanitization. Applied fields are: * description * applicationInfo.instruction * incentives * qualifications * responsibilities HTML tags in these fields may be stripped if sanitiazation isn&#39;t disabled. Defaults to HtmlSanitization.SIMPLE_FORMATTING_ONLY.
     * 
     */
    private final String htmlSanitization;

    @CustomType.Constructor
    private ProcessingOptionsResponse(
        @CustomType.Parameter("disableStreetAddressResolution") Boolean disableStreetAddressResolution,
        @CustomType.Parameter("htmlSanitization") String htmlSanitization) {
        this.disableStreetAddressResolution = disableStreetAddressResolution;
        this.htmlSanitization = htmlSanitization;
    }

    /**
     * @return If set to `true`, the service does not attempt to resolve a more precise address for the job.
     * 
     */
    public Boolean disableStreetAddressResolution() {
        return this.disableStreetAddressResolution;
    }
    /**
     * @return Option for job HTML content sanitization. Applied fields are: * description * applicationInfo.instruction * incentives * qualifications * responsibilities HTML tags in these fields may be stripped if sanitiazation isn&#39;t disabled. Defaults to HtmlSanitization.SIMPLE_FORMATTING_ONLY.
     * 
     */
    public String htmlSanitization() {
        return this.htmlSanitization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProcessingOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disableStreetAddressResolution;
        private String htmlSanitization;

        public Builder() {
    	      // Empty
        }

        public Builder(ProcessingOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableStreetAddressResolution = defaults.disableStreetAddressResolution;
    	      this.htmlSanitization = defaults.htmlSanitization;
        }

        public Builder disableStreetAddressResolution(Boolean disableStreetAddressResolution) {
            this.disableStreetAddressResolution = Objects.requireNonNull(disableStreetAddressResolution);
            return this;
        }
        public Builder htmlSanitization(String htmlSanitization) {
            this.htmlSanitization = Objects.requireNonNull(htmlSanitization);
            return this;
        }        public ProcessingOptionsResponse build() {
            return new ProcessingOptionsResponse(disableStreetAddressResolution, htmlSanitization);
        }
    }
}
