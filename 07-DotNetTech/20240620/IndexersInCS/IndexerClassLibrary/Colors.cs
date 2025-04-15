namespace IndexerClassLibrary
{
    public class Colors
    {
        // Private Fields
        private string[] _colors = new string[] { "Red", "Blue", "Green" };

        /* NO ONE USES IT THO */

        /// <summary>
        /// Indexers allow instances of a class or struct to be indexed just like arrays.
        /// </summary>
        /// <param name="index"></param>
        /// <returns></returns>
        // indexers
        public string this[int index]
        {
            get
            {
                return _colors[index];
            }
            set
            {
                this._colors[index] = value;    // 'this' keywaord is optional but still I am using it for some reason
            }
        }
    }
}
