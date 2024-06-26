// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetPropertyRulesBuilderRulesV20230105VariableArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105VariableArgs Empty = new GetPropertyRulesBuilderRulesV20230105VariableArgs();

    @Import(name="description", required=true)
    private Output<String> description;

    public Output<String> description() {
        return this.description;
    }

    @Import(name="hidden", required=true)
    private Output<Boolean> hidden;

    public Output<Boolean> hidden() {
        return this.hidden;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="sensitive", required=true)
    private Output<Boolean> sensitive;

    public Output<Boolean> sensitive() {
        return this.sensitive;
    }

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private GetPropertyRulesBuilderRulesV20230105VariableArgs() {}

    private GetPropertyRulesBuilderRulesV20230105VariableArgs(GetPropertyRulesBuilderRulesV20230105VariableArgs $) {
        this.description = $.description;
        this.hidden = $.hidden;
        this.name = $.name;
        this.sensitive = $.sensitive;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105VariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105VariableArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105VariableArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105VariableArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105VariableArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder hidden(Output<Boolean> hidden) {
            $.hidden = hidden;
            return this;
        }

        public Builder hidden(Boolean hidden) {
            return hidden(Output.of(hidden));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder sensitive(Output<Boolean> sensitive) {
            $.sensitive = sensitive;
            return this;
        }

        public Builder sensitive(Boolean sensitive) {
            return sensitive(Output.of(sensitive));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GetPropertyRulesBuilderRulesV20230105VariableArgs build() {
            if ($.description == null) {
                throw new MissingRequiredPropertyException("GetPropertyRulesBuilderRulesV20230105VariableArgs", "description");
            }
            if ($.hidden == null) {
                throw new MissingRequiredPropertyException("GetPropertyRulesBuilderRulesV20230105VariableArgs", "hidden");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetPropertyRulesBuilderRulesV20230105VariableArgs", "name");
            }
            if ($.sensitive == null) {
                throw new MissingRequiredPropertyException("GetPropertyRulesBuilderRulesV20230105VariableArgs", "sensitive");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("GetPropertyRulesBuilderRulesV20230105VariableArgs", "value");
            }
            return $;
        }
    }

}
