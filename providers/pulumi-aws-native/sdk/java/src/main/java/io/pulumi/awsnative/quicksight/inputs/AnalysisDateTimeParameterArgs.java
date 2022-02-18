// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * <p>A date-time parameter.</p>
 * 
 */
public final class AnalysisDateTimeParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalysisDateTimeParameterArgs Empty = new AnalysisDateTimeParameterArgs();

    /**
     * <p>A display name for the date-time parameter.</p>
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * <p>The values for the date-time parameter.</p>
     * 
     */
    @InputImport(name="values", required=true)
    private final Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values;
    }

    public AnalysisDateTimeParameterArgs(
        Input<String> name,
        Input<List<String>> values) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private AnalysisDateTimeParameterArgs() {
        this.name = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalysisDateTimeParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalysisDateTimeParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setValues(Input<List<String>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Input.of(Objects.requireNonNull(values));
            return this;
        }

        public AnalysisDateTimeParameterArgs build() {
            return new AnalysisDateTimeParameterArgs(name, values);
        }
    }
}
