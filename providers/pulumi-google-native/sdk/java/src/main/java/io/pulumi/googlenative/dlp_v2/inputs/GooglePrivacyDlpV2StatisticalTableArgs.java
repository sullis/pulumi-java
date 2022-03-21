// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2BigQueryTableArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2QuasiIdentifierFieldArgs;
import java.util.List;
import java.util.Objects;


/**
 * An auxiliary table containing statistical information on the relative frequency of different quasi-identifiers values. It has one or several quasi-identifiers columns, and one column that indicates the relative frequency of each quasi-identifier tuple. If a tuple is present in the data but not in the auxiliary table, the corresponding relative frequency is assumed to be zero (and thus, the tuple is highly reidentifiable).
 * 
 */
public final class GooglePrivacyDlpV2StatisticalTableArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2StatisticalTableArgs Empty = new GooglePrivacyDlpV2StatisticalTableArgs();

    /**
     * Quasi-identifier columns.
     * 
     */
    @Import(name="quasiIds", required=true)
      private final Output<List<GooglePrivacyDlpV2QuasiIdentifierFieldArgs>> quasiIds;

    public Output<List<GooglePrivacyDlpV2QuasiIdentifierFieldArgs>> getQuasiIds() {
        return this.quasiIds;
    }

    /**
     * The relative frequency column must contain a floating-point number between 0 and 1 (inclusive). Null values are assumed to be zero.
     * 
     */
    @Import(name="relativeFrequency", required=true)
      private final Output<GooglePrivacyDlpV2FieldIdArgs> relativeFrequency;

    public Output<GooglePrivacyDlpV2FieldIdArgs> getRelativeFrequency() {
        return this.relativeFrequency;
    }

    /**
     * Auxiliary table location.
     * 
     */
    @Import(name="table", required=true)
      private final Output<GooglePrivacyDlpV2BigQueryTableArgs> table;

    public Output<GooglePrivacyDlpV2BigQueryTableArgs> getTable() {
        return this.table;
    }

    public GooglePrivacyDlpV2StatisticalTableArgs(
        Output<List<GooglePrivacyDlpV2QuasiIdentifierFieldArgs>> quasiIds,
        Output<GooglePrivacyDlpV2FieldIdArgs> relativeFrequency,
        Output<GooglePrivacyDlpV2BigQueryTableArgs> table) {
        this.quasiIds = Objects.requireNonNull(quasiIds, "expected parameter 'quasiIds' to be non-null");
        this.relativeFrequency = Objects.requireNonNull(relativeFrequency, "expected parameter 'relativeFrequency' to be non-null");
        this.table = Objects.requireNonNull(table, "expected parameter 'table' to be non-null");
    }

    private GooglePrivacyDlpV2StatisticalTableArgs() {
        this.quasiIds = Output.empty();
        this.relativeFrequency = Output.empty();
        this.table = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2StatisticalTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<GooglePrivacyDlpV2QuasiIdentifierFieldArgs>> quasiIds;
        private Output<GooglePrivacyDlpV2FieldIdArgs> relativeFrequency;
        private Output<GooglePrivacyDlpV2BigQueryTableArgs> table;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2StatisticalTableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quasiIds = defaults.quasiIds;
    	      this.relativeFrequency = defaults.relativeFrequency;
    	      this.table = defaults.table;
        }

        public Builder quasiIds(Output<List<GooglePrivacyDlpV2QuasiIdentifierFieldArgs>> quasiIds) {
            this.quasiIds = Objects.requireNonNull(quasiIds);
            return this;
        }
        public Builder quasiIds(List<GooglePrivacyDlpV2QuasiIdentifierFieldArgs> quasiIds) {
            this.quasiIds = Output.of(Objects.requireNonNull(quasiIds));
            return this;
        }
        public Builder quasiIds(GooglePrivacyDlpV2QuasiIdentifierFieldArgs... quasiIds) {
            return quasiIds(List.of(quasiIds));
        }
        public Builder relativeFrequency(Output<GooglePrivacyDlpV2FieldIdArgs> relativeFrequency) {
            this.relativeFrequency = Objects.requireNonNull(relativeFrequency);
            return this;
        }
        public Builder relativeFrequency(GooglePrivacyDlpV2FieldIdArgs relativeFrequency) {
            this.relativeFrequency = Output.of(Objects.requireNonNull(relativeFrequency));
            return this;
        }
        public Builder table(Output<GooglePrivacyDlpV2BigQueryTableArgs> table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }
        public Builder table(GooglePrivacyDlpV2BigQueryTableArgs table) {
            this.table = Output.of(Objects.requireNonNull(table));
            return this;
        }        public GooglePrivacyDlpV2StatisticalTableArgs build() {
            return new GooglePrivacyDlpV2StatisticalTableArgs(quasiIds, relativeFrequency, table);
        }
    }
}
