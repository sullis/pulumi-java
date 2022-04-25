// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class DataTransferConfigEmailPreferences {
    /**
     * @return If true, email notifications will be sent on transfer run failures.
     * 
     */
    private final Boolean enableFailureEmail;

    @CustomType.Constructor
    private DataTransferConfigEmailPreferences(@CustomType.Parameter("enableFailureEmail") Boolean enableFailureEmail) {
        this.enableFailureEmail = enableFailureEmail;
    }

    /**
     * @return If true, email notifications will be sent on transfer run failures.
     * 
     */
    public Boolean enableFailureEmail() {
        return this.enableFailureEmail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataTransferConfigEmailPreferences defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableFailureEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(DataTransferConfigEmailPreferences defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableFailureEmail = defaults.enableFailureEmail;
        }

        public Builder enableFailureEmail(Boolean enableFailureEmail) {
            this.enableFailureEmail = Objects.requireNonNull(enableFailureEmail);
            return this;
        }        public DataTransferConfigEmailPreferences build() {
            return new DataTransferConfigEmailPreferences(enableFailureEmail);
        }
    }
}
