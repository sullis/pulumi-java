// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>Wait policy to use when creating/updating dataset. Default is to wait for SPICE ingestion to finish with timeout of 36 hours.</p>
 * 
 */
public final class DataSetIngestionWaitPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSetIngestionWaitPolicyArgs Empty = new DataSetIngestionWaitPolicyArgs();

    /**
     * <p>The maximum time (in hours) to wait for Ingestion to complete. Default timeout is 36 hours.
     *  Applicable only when DataSetImportMode mode is set to SPICE and WaitForSpiceIngestion is set to true.</p>
     * 
     */
    @InputImport(name="ingestionWaitTimeInHours")
    private final @Nullable Input<Double> ingestionWaitTimeInHours;

    public Input<Double> getIngestionWaitTimeInHours() {
        return this.ingestionWaitTimeInHours == null ? Input.empty() : this.ingestionWaitTimeInHours;
    }

    /**
     * <p>Wait for SPICE ingestion to finish to mark dataset creation/update successful. Default (true).
     *   Applicable only when DataSetImportMode mode is set to SPICE.</p>
     * 
     */
    @InputImport(name="waitForSpiceIngestion")
    private final @Nullable Input<Boolean> waitForSpiceIngestion;

    public Input<Boolean> getWaitForSpiceIngestion() {
        return this.waitForSpiceIngestion == null ? Input.empty() : this.waitForSpiceIngestion;
    }

    public DataSetIngestionWaitPolicyArgs(
        @Nullable Input<Double> ingestionWaitTimeInHours,
        @Nullable Input<Boolean> waitForSpiceIngestion) {
        this.ingestionWaitTimeInHours = ingestionWaitTimeInHours;
        this.waitForSpiceIngestion = waitForSpiceIngestion;
    }

    private DataSetIngestionWaitPolicyArgs() {
        this.ingestionWaitTimeInHours = Input.empty();
        this.waitForSpiceIngestion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetIngestionWaitPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> ingestionWaitTimeInHours;
        private @Nullable Input<Boolean> waitForSpiceIngestion;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetIngestionWaitPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingestionWaitTimeInHours = defaults.ingestionWaitTimeInHours;
    	      this.waitForSpiceIngestion = defaults.waitForSpiceIngestion;
        }

        public Builder setIngestionWaitTimeInHours(@Nullable Input<Double> ingestionWaitTimeInHours) {
            this.ingestionWaitTimeInHours = ingestionWaitTimeInHours;
            return this;
        }

        public Builder setIngestionWaitTimeInHours(@Nullable Double ingestionWaitTimeInHours) {
            this.ingestionWaitTimeInHours = Input.ofNullable(ingestionWaitTimeInHours);
            return this;
        }

        public Builder setWaitForSpiceIngestion(@Nullable Input<Boolean> waitForSpiceIngestion) {
            this.waitForSpiceIngestion = waitForSpiceIngestion;
            return this;
        }

        public Builder setWaitForSpiceIngestion(@Nullable Boolean waitForSpiceIngestion) {
            this.waitForSpiceIngestion = Input.ofNullable(waitForSpiceIngestion);
            return this;
        }

        public DataSetIngestionWaitPolicyArgs build() {
            return new DataSetIngestionWaitPolicyArgs(ingestionWaitTimeInHours, waitForSpiceIngestion);
        }
    }
}
