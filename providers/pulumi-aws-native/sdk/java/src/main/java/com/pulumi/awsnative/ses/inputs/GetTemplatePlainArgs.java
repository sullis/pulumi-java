// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ses.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTemplatePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTemplatePlainArgs Empty = new GetTemplatePlainArgs();

    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    private GetTemplatePlainArgs() {}

    private GetTemplatePlainArgs(GetTemplatePlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTemplatePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTemplatePlainArgs $;

        public Builder() {
            $ = new GetTemplatePlainArgs();
        }

        public Builder(GetTemplatePlainArgs defaults) {
            $ = new GetTemplatePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetTemplatePlainArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
