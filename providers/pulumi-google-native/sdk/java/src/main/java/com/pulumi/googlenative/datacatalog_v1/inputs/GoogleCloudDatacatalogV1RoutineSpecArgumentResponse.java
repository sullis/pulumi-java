// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Input or output argument of a function or stored procedure.
 * 
 */
public final class GoogleCloudDatacatalogV1RoutineSpecArgumentResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1RoutineSpecArgumentResponse Empty = new GoogleCloudDatacatalogV1RoutineSpecArgumentResponse();

    /**
     * Specifies whether the argument is input or output.
     * 
     */
    @Import(name="mode", required=true)
    private String mode;

    /**
     * @return Specifies whether the argument is input or output.
     * 
     */
    public String mode() {
        return this.mode;
    }

    /**
     * The name of the argument. A return argument of a function might not have a name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the argument. A return argument of a function might not have a name.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Type of the argument. The exact value depends on the source system and the language.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of the argument. The exact value depends on the source system and the language.
     * 
     */
    public String type() {
        return this.type;
    }

    private GoogleCloudDatacatalogV1RoutineSpecArgumentResponse() {}

    private GoogleCloudDatacatalogV1RoutineSpecArgumentResponse(GoogleCloudDatacatalogV1RoutineSpecArgumentResponse $) {
        this.mode = $.mode;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatacatalogV1RoutineSpecArgumentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1RoutineSpecArgumentResponse $;

        public Builder() {
            $ = new GoogleCloudDatacatalogV1RoutineSpecArgumentResponse();
        }

        public Builder(GoogleCloudDatacatalogV1RoutineSpecArgumentResponse defaults) {
            $ = new GoogleCloudDatacatalogV1RoutineSpecArgumentResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param mode Specifies whether the argument is input or output.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param name The name of the argument. A return argument of a function might not have a name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param type Type of the argument. The exact value depends on the source system and the language.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GoogleCloudDatacatalogV1RoutineSpecArgumentResponse build() {
            $.mode = Objects.requireNonNull($.mode, "expected parameter 'mode' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
