// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The location of file server dataset.
 * 
 */
public final class FileServerLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileServerLocationArgs Empty = new FileServerLocationArgs();

    /**
     * Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileName")
    private @Nullable Output<Object> fileName;

    /**
     * @return Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> fileName() {
        return Optional.ofNullable(this.fileName);
    }

    /**
     * Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    @Import(name="folderPath")
    private @Nullable Output<Object> folderPath;

    /**
     * @return Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    public Optional<Output<Object>> folderPath() {
        return Optional.ofNullable(this.folderPath);
    }

    /**
     * Type of dataset storage location.
     * Expected value is &#39;FileServerLocation&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of dataset storage location.
     * Expected value is &#39;FileServerLocation&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private FileServerLocationArgs() {}

    private FileServerLocationArgs(FileServerLocationArgs $) {
        this.fileName = $.fileName;
        this.folderPath = $.folderPath;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileServerLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileServerLocationArgs $;

        public Builder() {
            $ = new FileServerLocationArgs();
        }

        public Builder(FileServerLocationArgs defaults) {
            $ = new FileServerLocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fileName Specify the file name of dataset. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder fileName(@Nullable Output<Object> fileName) {
            $.fileName = fileName;
            return this;
        }

        /**
         * @param fileName Specify the file name of dataset. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder fileName(Object fileName) {
            return fileName(Output.of(fileName));
        }

        /**
         * @param folderPath Specify the folder path of dataset. Type: string (or Expression with resultType string)
         * 
         * @return builder
         * 
         */
        public Builder folderPath(@Nullable Output<Object> folderPath) {
            $.folderPath = folderPath;
            return this;
        }

        /**
         * @param folderPath Specify the folder path of dataset. Type: string (or Expression with resultType string)
         * 
         * @return builder
         * 
         */
        public Builder folderPath(Object folderPath) {
            return folderPath(Output.of(folderPath));
        }

        /**
         * @param type Type of dataset storage location.
         * Expected value is &#39;FileServerLocation&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of dataset storage location.
         * Expected value is &#39;FileServerLocation&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FileServerLocationArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
