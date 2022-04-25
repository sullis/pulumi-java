// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.containeranalysis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NoteAttestationAuthorityHint {
    /**
     * @return The human readable name of this Attestation Authority, for
     * example &#34;qa&#34;.
     * 
     */
    private final String humanReadableName;

    @CustomType.Constructor
    private NoteAttestationAuthorityHint(@CustomType.Parameter("humanReadableName") String humanReadableName) {
        this.humanReadableName = humanReadableName;
    }

    /**
     * @return The human readable name of this Attestation Authority, for
     * example &#34;qa&#34;.
     * 
     */
    public String humanReadableName() {
        return this.humanReadableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NoteAttestationAuthorityHint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String humanReadableName;

        public Builder() {
    	      // Empty
        }

        public Builder(NoteAttestationAuthorityHint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.humanReadableName = defaults.humanReadableName;
        }

        public Builder humanReadableName(String humanReadableName) {
            this.humanReadableName = Objects.requireNonNull(humanReadableName);
            return this;
        }        public NoteAttestationAuthorityHint build() {
            return new NoteAttestationAuthorityHint(humanReadableName);
        }
    }
}
