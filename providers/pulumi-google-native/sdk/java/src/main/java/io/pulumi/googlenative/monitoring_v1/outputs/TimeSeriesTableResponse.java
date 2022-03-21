// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.monitoring_v1.outputs.TableDataSetResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class TimeSeriesTableResponse {
    /**
     * The data displayed in this table.
     * 
     */
    private final List<TableDataSetResponse> dataSets;

    @CustomType.Constructor
    private TimeSeriesTableResponse(@CustomType.Parameter("dataSets") List<TableDataSetResponse> dataSets) {
        this.dataSets = dataSets;
    }

    /**
     * The data displayed in this table.
     * 
    */
    public List<TableDataSetResponse> getDataSets() {
        return this.dataSets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeSeriesTableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<TableDataSetResponse> dataSets;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeSeriesTableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSets = defaults.dataSets;
        }

        public Builder dataSets(List<TableDataSetResponse> dataSets) {
            this.dataSets = Objects.requireNonNull(dataSets);
            return this;
        }
        public Builder dataSets(TableDataSetResponse... dataSets) {
            return dataSets(List.of(dataSets));
        }        public TimeSeriesTableResponse build() {
            return new TimeSeriesTableResponse(dataSets);
        }
    }
}
