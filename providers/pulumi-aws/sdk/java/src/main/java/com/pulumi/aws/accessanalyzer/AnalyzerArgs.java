// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.accessanalyzer;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnalyzerArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnalyzerArgs Empty = new AnalyzerArgs();

    /**
     * Name of the Analyzer.
     * 
     */
    @Import(name="analyzerName", required=true)
    private Output<String> analyzerName;

    /**
     * @return Name of the Analyzer.
     * 
     */
    public Output<String> analyzerName() {
        return this.analyzerName;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Type of Analyzer. Valid values are `ACCOUNT` or `ORGANIZATION`. Defaults to `ACCOUNT`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of Analyzer. Valid values are `ACCOUNT` or `ORGANIZATION`. Defaults to `ACCOUNT`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private AnalyzerArgs() {}

    private AnalyzerArgs(AnalyzerArgs $) {
        this.analyzerName = $.analyzerName;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnalyzerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalyzerArgs $;

        public Builder() {
            $ = new AnalyzerArgs();
        }

        public Builder(AnalyzerArgs defaults) {
            $ = new AnalyzerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param analyzerName Name of the Analyzer.
         * 
         * @return builder
         * 
         */
        public Builder analyzerName(Output<String> analyzerName) {
            $.analyzerName = analyzerName;
            return this;
        }

        /**
         * @param analyzerName Name of the Analyzer.
         * 
         * @return builder
         * 
         */
        public Builder analyzerName(String analyzerName) {
            return analyzerName(Output.of(analyzerName));
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param type Type of Analyzer. Valid values are `ACCOUNT` or `ORGANIZATION`. Defaults to `ACCOUNT`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of Analyzer. Valid values are `ACCOUNT` or `ORGANIZATION`. Defaults to `ACCOUNT`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AnalyzerArgs build() {
            $.analyzerName = Objects.requireNonNull($.analyzerName, "expected parameter 'analyzerName' to be non-null");
            return $;
        }
    }

}
